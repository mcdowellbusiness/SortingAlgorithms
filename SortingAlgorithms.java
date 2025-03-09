import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//Test Commit and push

public class SortingAlgorithms {
    
    // Bubble Sort Implementation
    public static int[] bubbleSort(int[] array) {
        // Make a copy of the array to avoid modifying the original
        int[] result = Arrays.copyOf(array, array.length);
        
        // TODO: Implement Bubble Sort Algorithm
        
        return result;
    }
    
    // Selection Sort Implementation
    public static int[] selectionSort(int[] array) {
        // Make a copy of the array to avoid modifying the original
        int[] result = Arrays.copyOf(array, array.length);
        
        // TODO: Implement Selection Sort Algorithm
        
        return result;
    }
    
    // Insertion Sort Implementation
    public static int[] insertionSort(int[] array) {
        // Make a copy of the array to avoid modifying the original
        int[] result = Arrays.copyOf(array, array.length);
        
        // TODO: Implement Insertion Sort Algorithm
        
        return result;
    }
    
    // Merge Sort Implementation
    public static int[] mergeSort(int[] array) {
        // Make a copy of the array to avoid modifying the original
        int[] result = Arrays.copyOf(array, array.length);
        
        // TODO: Implement Merge Sort Algorithm
        
        return result;
    }
    
    // Quick Sort Implementation
    public static int[] quickSort(int[] array) {
        // Make a copy of the array to avoid modifying the original
        int[] result = Arrays.copyOf(array, array.length);
        
        // TODO: Implement Quick Sort Algorithm
        
        return result;
    }
    
    // Helper method to print arrays
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Main method to test sorting algorithms
    public static void main(String[] args) {
        int[] array = null;
        
        // Read input from file
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line = br.readLine();
            String[] strNumbers = line.split(",");
            array = new int[strNumbers.length];
            
            for (int i = 0; i < strNumbers.length; i++) {
                array[i] = Integer.parseInt(strNumbers[i].trim());
            }
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }
        
        // Display original array
        System.out.println("Original array:");
        printArray(array);
        
        // Test Bubble Sort
        System.out.println("\nBubble Sort:");
        int[] bubbleSorted = bubbleSort(array);
        printArray(bubbleSorted);
        
        // Test Selection Sort
        System.out.println("\nSelection Sort:");
        int[] selectionSorted = selectionSort(array);
        printArray(selectionSorted);
        
        // Test Insertion Sort
        System.out.println("\nInsertion Sort:");
        int[] insertionSorted = insertionSort(array);
        printArray(insertionSorted);
        
        // Test Merge Sort
        System.out.println("\nMerge Sort:");
        int[] mergeSorted = mergeSort(array);
        printArray(mergeSorted);
        
        // Test Quick Sort
        System.out.println("\nQuick Sort:");
        int[] quickSorted = quickSort(array);
        printArray(quickSorted);
        
        // Display original array again for comparison
        System.out.println("\nOriginal array (unchanged):");
        printArray(array);
    }
}
