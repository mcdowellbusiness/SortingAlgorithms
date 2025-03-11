import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * 
     * Bubble Sort repeatedly steps through the list, compares adjacent elements,
     * and swaps them if they are in the wrong order. The pass through the list is 
     * repeated until no swaps are needed, which indicates that the list is sorted.
     *
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;  // Optimization: If no swaps occur, the array is sorted
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Reset swapped flag for each pass
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }

            // If no two elements were swapped in inner loop, the array is sorted
            if (!swapped) {
                break; // Exit the outer loop
            }
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(",");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i].trim());
            }
            scanner.close();

            System.out.println("Original array: " + Arrays.toString(arr));
            bubbleSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number in input.txt.");
        }
    }
}
