#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
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

    bubbleSort(arr, n);

    printf("Sorted numbers:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
