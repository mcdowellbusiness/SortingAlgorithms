#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

void selectionSort(int arr[], int n) {
    int i, j, minIndex, temp;
    for (i = 0; i < n - 1; i++) {
        minIndex = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

int main() {
    FILE *file;
    int arr[MAX_SIZE], n = 0;

    file = fopen("input.txt", "r");
    if (file == NULL) {
        printf("Error opening file!\n");
        return 1;
    }

    while (fscanf(file, "%d,", &arr[n]) == 1) {
        n++;
        if (n >= MAX_SIZE) break;
    }
    fclose(file);

    selectionSort(arr, n);

    printf("Sorted numbers:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}

