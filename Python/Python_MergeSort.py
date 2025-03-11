# Sorts a given array by repeatedly dividing it into two halves, until down to
# two numbers, and then sorting the havles until the original-sized array is
# fully sorted
def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2  # Finding the middle of the array
        left = arr[:mid]     # Dividing the array elements
        right = arr[mid:]

        merge_sort(left)     # Sorting the first half
        merge_sort(right)    # Sorting the second half

        i = j = k = 0

        # Copy data to temp arrays left[] and right[]
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1
            k += 1

        # Check for any remaining elements
        while i < len(left):
            arr[k] = left[i]
            i += 1
            k += 1
        
        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1

# Sample input to test the algorithm
arr = [12, 11, 13, 5, 6, 7]
print("Original array is:", arr)
merge_sort(arr)
print("Sorted array is:", arr)
