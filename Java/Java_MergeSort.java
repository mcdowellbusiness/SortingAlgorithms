=import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    /**
     * Sorts an array of integers using the Merge Sort algorithm.
     * Merge Sort is a divide-and-conquer algorithm that splits the array
     * into smaller subarrays, sorts them, and then merges them back together.
     *
     * @param arr The array to be sorted.
     */
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: If array is of length 1, it's already sorted.
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    /**
     * Merges two sorted subarrays into one sorted array.
     *
     * @param arr The original array where merged output will be stored.
     * @param left The left subarray.
     * @param right The right subarray.
     */
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
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
            mergeSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number in input.txt.");
        }
    }
}


