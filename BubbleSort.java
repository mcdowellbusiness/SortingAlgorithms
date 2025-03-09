
  public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;  // Optimization: If no swaps occur, the array is sorted
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Reset swapped flag for each pass
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }

            // If no two elements were swapped in inner loop, the array is sorted
            if (!swapped) {
                break; // Exit the outer loop
            }
        }
    }


