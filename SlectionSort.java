import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    /**
     * Sorts an array of integers using the Selection Sort algorithm.
     * Selection Sort repeatedly finds the minimum element from the unsorted part
     * and places it at the beginning. The algorithm divides the array into two parts:
     * the sorted part (at the beginning) and the unsorted part (the rest of the array).
     *
     * @param arr The array to be sorted.
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            if (min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
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
            selectionSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number in input.txt.");
        }
    }
}
