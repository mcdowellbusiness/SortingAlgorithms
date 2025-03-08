#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_ARRAY_SIZE 1000

// Function prototypes
void bubbleSort(int arr[], int n, int result[]);
void selectionSort(int arr[], int n, int result[]);
void insertionSort(int arr[], int n, int result[]);
void mergeSort(int arr[], int n, int result[]);
void quickSort(int arr[], int n, int result[]);
void printArray(int arr[], int n);
void copyArray(int source[], int dest[], int n);

// Bubble Sort Implementation
void bubbleSort(int arr[], int n, int result[]) {
    // Copy the array to avoid modifying the original
    copyArray(arr, result, n);
    
    // TODO: Implement Bubble Sort Algorithm
}

// Selection Sort Implementation
void selectionSort(int arr[], int n, int result[]) {
    // Copy the array to avoid modifying the original
    copyArray(arr, result, n);
    
    // TODO: Implement Selection Sort Algorithm
}

// Insertion Sort Implementation
void insertionSort(int arr[], int n, int result[]) {
    // Copy the array to avoid modifying the original
    copyArray(arr, result, n);
    
    // TODO: Implement Insertion Sort Algorithm
}

// Merge Sort Implementation
void mergeSort(int arr[], int n, int result[]) {
    // Copy the array to avoid modifying the original
    copyArray(arr, result, n);
    
    // TODO: Implement Merge Sort Algorithm
}

// Quick Sort Implementation
void quickSort(int arr[], int n, int result[]) {
    // Copy the array to avoid modifying the original
    copyArray(arr, result, n);
    
    // TODO: Implement Quick Sort Algorithm
}

// Helper function to copy array
void copyArray(int source[], int dest[], int n) {
    for (int i = 0; i < n; i++) {
        dest[i] = source[i];
    }
}

// Helper function to print array
void printArray(int arr[], int n) {
    printf("[");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1) {
            printf(", ");
        }
    }
    printf("]\n");
}

int main() {
    FILE *file;
    char line[MAX_ARRAY_SIZE * 10]; // Buffer for reading line
    int originalArray[MAX_ARRAY_SIZE];
    int resultArray[MAX_ARRAY_SIZE];
    int n = 0; // Size of array
    
    // Read input from file
    file = fopen("input.txt", "r");
    if (file == NULL) {
        printf("Error opening input file\n");
        return 1;
    }
    
    if (fgets(line, sizeof(line), file)) {
        char *token = strtok(line, ",");
        while (token != NULL && n < MAX_ARRAY_SIZE) {
            originalArray[n++] = atoi(token);
            token = strtok(NULL, ",");
        }
    }
    
    fclose(file);
    
    if (n == 0) {
        printf("No numbers found in input file\n");
        return 1;
    }
    
    // Display original array
    printf("Original array:\n");
    printArray(originalArray, n);
    
    // Test Bubble Sort
    printf("\nBubble Sort:\n");
    bubbleSort(originalArray, n, resultArray);
    printArray(resultArray, n);
    
    // Test Selection Sort
    printf("\nSelection Sort:\n");
    selectionSort(originalArray, n, resultArray);
    printArray(resultArray, n);
    
    // Test Insertion Sort
    printf("\nInsertion Sort:\n");
    insertionSort(originalArray, n, resultArray);
    printArray(resultArray, n);
    
    // Test Merge Sort
    printf("\nMerge Sort:\n");
    mergeSort(originalArray, n, resultArray);
    printArray(resultArray, n);
    
    // Test Quick Sort
    printf("\nQuick Sort:\n");
    quickSort(originalArray, n, resultArray);
    printArray(resultArray, n);
    
    // Display original array again for comparison
    printf("\nOriginal array (unchanged):\n");
    printArray(originalArray, n);
    
    return 0;
}
