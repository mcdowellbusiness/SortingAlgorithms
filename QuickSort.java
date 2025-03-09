import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    /**
     * Sorts an array of integers using the Quick Sort algorithm.
     * Quick Sort is a divide-and-conquer algorithm that selects a pivot element,
     * partitions the array around the pivot, and recursively sorts the subarrays.
     *
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array using the last element as the pivot.
     *
     * @param arr The array to partition.
     * @param low The starting index.
     * @param high The ending index (pivot element).
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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
            quickSort(arr, 0, arr.length - 1);
            System.out.println("Sorted array: " + Arrays.toString(arr));

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number in input.txt.");
        }
    }
}
