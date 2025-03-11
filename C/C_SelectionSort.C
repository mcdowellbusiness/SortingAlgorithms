#include <stdio.h>

// Function to copy an array
void copyArray(int source[], int destination[], int n) {
    for (int i = 0; i < n; i++) {
        destination[i] = source[i];
    }
}

// Bubble Sort Implementation.
void bubbleSort(int arr[], int n, int result[]) {
    // Copy the array to avoid modifying the original
    copyArray(arr, result, n);
    
    int i, j, temp;
    int swapped;
    for (i = 0; i < n - 1; i++) {
        swapped = 0;
        for (j = 0; j < n - i - 1; j++) {
            if (result[j] > result[j + 1]) {
                // Swap elements
                temp = result[j];
                result[j] = result[j + 1];
                result[j + 1] = temp;
                swapped = 1;
            }
        }
        // If no swaps happened, the array is already sorted
        if (swapped == 0) break;
    }
}

// Function to print an array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Main function to test bubble sort
int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr) / sizeof(arr[0]);
    int result[n];

    printf("Original array: \n");
    printArray(arr, n);

    bubbleSort(arr, n, result);

    printf("Sorted array: \n");
    printArray(result, n);

    return 0;
}

