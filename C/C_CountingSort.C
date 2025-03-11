#include <stdio.h>
#include <stdlib.h>

// Sorts a given array by counting the amount of times the values 0-9 occur
// in the array and displays the values the count-amount of times
void countSort(int inputArray[], int n) {
	// Finding the max element of array
	int m = 0;
	for(int i = 0; i < n; i++) {
		if(inputArray[i] > m) {
			m = inputArray[i];
		}
	}

	// Initializing countArray[] with 0
	int* countArray = (int*)calloc(m+1, sizeof(int));

	// Mapping each element of inputArray[] as an index
	// of countArray[]
	for(int i = 1; i < n; i++) {
		countArray[inputArray[i]]++;
	}

	// Calculating prefix sum at every index
	for(int i = 1; i <= m; i++) {
		countArray[i] += countArray[i - 1];
	}

	// Creating outputArray[] from countArray[] array
	int* outputArray = (int*)malloc(n * sizeof(int));
	for(int i = n - 1; i >= 0; i--) {
		outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
		countArray[inputArray[i]]--;
	}

	// Copying sorted elements back to inputArray[]
	for(int i = 0; i < n; i++) {
		inputArray[i] = outputArray[i];
	}

	// Freeing dynamically allocated memory
	free(countArray);
	free(outputArray);
}

int main() {
	// Input array
	int inputArray[] = {64, 34, 25, 12, 22, 11, 90, 45, 73, 51, 38, 82, 17, 9, 62};
	int n = sizeof(inputArray) / sizeof(inputArray[0]);

	// Sorting the array
	countSort(inputArray, n);

	// Printing the sorted array
	for(int i = 0; i < n; i++) {
		printf("%d ", inputArray[i]);
	}

	return 0
}
