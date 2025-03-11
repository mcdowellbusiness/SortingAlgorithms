import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Java_InsertionSort{
	
	//takes an int array in and uses the insertion sort algorithm to sort it
	//from least to greatest order
	public static void insertionSort(int[] arr){
		
		int n = arr.length;
		for(int i=1; i<n; i++){
			int key = arr[i];
			int j = i-1;

			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}

	public static void main(String[] args){
		
		try{
			File file = new File("input.txt");
			Scanner scanner = new Scanner(file);
			String line = scanner.nextLine();
			String[] numbers = line.split(",");
			int[] arr = new int[numbers.length];

			for(int i=0; i<numbers.length; i++){
				arr[i] = Integer.parseInt(numbers[i].trim());
			}
			scanner.close();

			System.out.println("Original array: " + Arrays.toString(arr));
			insertionSort(arr);
			System.out.println("Sorted array: " + Arrays.toString(arr));

		} catch (FileNotFoundException e){
			System.out.println("Error: input.txt not found");
		} catch (NumberFormatException e){
			System.out.println("Error: Invalid number in input.txt");
		}
		
	}

}
