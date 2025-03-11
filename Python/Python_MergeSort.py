def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left = arr[:mid]
    right = arr[mid:]
    
    # Recursively sort the two halves
    merge_sort(left)
    merge_sort(right)
    
    # Merge the sorted halves
    i = j = k = 0
    
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            arr[k] = left[i]
            i += 1
        else:
            arr[k] = right[j]
            j += 1
        k += 1
    
    # Check for remaining elements
    while i < len(left):
        arr[k] = left[i]
        i += 1
        k += 1
    
    while j < len(right):
        arr[k] = right[j]
        j += 1
        k += 1
    
    return arr

def main():
    try:
        with open('input.txt', 'r') as file:
            line = file.readline()
            numbers = line.split(',')
            arr = [int(num.strip()) for num in numbers]
            
        print("Original array:", arr)
        sorted_arr = merge_sort(arr)
        print("Sorted array:", sorted_arr)
        
    except FileNotFoundError:
        print("Error: input.txt not found.")
    except ValueError:
        print("Error: Invalid number in input.txt.")

if __name__ == "__main__":
    main()
