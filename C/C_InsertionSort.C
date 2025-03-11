#include <stdio.h>
#include <stdlib.h>

// Sorts a given array by repeatedly taking a value from the array,
// comparing it to each already-sorted value, and determines the 
// first instance where it is larger than all other values already
// stored (therefore finding the correct sorted position for the value)
void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
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

    insertionSort(arr, n);

    printf("Sorted array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}



