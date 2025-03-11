#include <stdio.h>
#include <stdlib.h>

// Switches the order of two values
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Ensures that all values to the left of a pivot value are less than the 
// pivot value and that all values to the right are greater than the pivot
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

// Recursively breaks a given array down into subarrays, with one containing
// the values less than a selected pivot and the other containing the values
// greater than the pivot until all subarrays are combined to become a 
// sorted version of the original array
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main() {
    FILE *file = fopen("input.txt", "r");
    if (file == NULL) {
        perror("Unable to open input.txt");
        return 1;
    }

    int arr[1000];
    int n = 0;

    while (fscanf(file, "%d", &arr[n]) == 1) {
        n++;
    }
    fclose(file);

    quickSort(arr, 0, n - 1);

    printf("Sorted array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}


