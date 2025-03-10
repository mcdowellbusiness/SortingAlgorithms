import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    /**
     * Sorts an array of integers using the Quick Sort algorithm.
     * Quick Sort is a divide-and-conquer algorithm that selects a pivot element,
     * partitions the array around the pivot, and then recursively sorts the subarrays.
     *
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array around a pivot such that elements less than the pivot
     * are on the left, and elements greater than the pivot are on the right.
     *
     * @param arr The array to partition.
     * @param low The starting index.
     * @param high The ending index.
     * @return The index of the pivot after partitioning.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr The array containing the elements.
     * @param i The first index.
     * @param j The second index.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
