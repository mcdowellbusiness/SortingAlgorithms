def bubble_sort(arr):
    """
    Implementation of Bubble Sort algorithm
    """
    # Make a copy of the list to avoid modifying the original
    result = arr.copy()
    
    # TODO: Implement Bubble Sort Algorithm
    
    return result

def selection_sort(arr):
    """
    Implementation of Selection Sort algorithm
    """
    # Make a copy of the list to avoid modifying the original
    result = arr.copy()
    
    # TODO: Implement Selection Sort Algorithm
    
    return result

def insertion_sort(arr):
    """
    Implementation of Insertion Sort algorithm
    """
    # Make a copy of the list to avoid modifying the original
    result = arr.copy()
    
    # TODO: Implement Insertion Sort Algorithm
    
    return result

def merge_sort(arr):
    """
    Implementation of Merge Sort algorithm
    """
    # Make a copy of the list to avoid modifying the original
    result = arr.copy()
    
    # TODO: Implement Merge Sort Algorithm
    
    return result

def quick_sort(arr):
    """
    Implementation of Quick Sort algorithm
    """
    # Make a copy of the list to avoid modifying the original
    result = arr.copy()
    
    # TODO: Implement Quick Sort Algorithm
    
    return result

def print_array(arr):
    """
    Helper function to print arrays
    """
    print(arr)

def main():
    # Read input from file
    try:
        with open('input.txt', 'r') as file:
            line = file.readline().strip()
            # Convert comma-separated string to list of integers
            original_array = [int(x.strip()) for x in line.split(',')]
    except Exception as e:
        print(f"Error reading input file: {str(e)}")
        return
    
    # Display original array
    print("Original array:")
    print_array(original_array)
    
    # Test Bubble Sort
    print("\nBubble Sort:")
    bubble_sorted = bubble_sort(original_array)
    print_array(bubble_sorted)
    
    # Test Selection Sort
    print("\nSelection Sort:")
    selection_sorted = selection_sort(original_array)
    print_array(selection_sorted)
    
    # Test Insertion Sort
    print("\nInsertion Sort:")
    insertion_sorted = insertion_sort(original_array)
    print_array(insertion_sorted)
    
    # Test Merge Sort
    print("\nMerge Sort:")
    merge_sorted = merge_sort(original_array)
    print_array(merge_sorted)
    
    # Test Quick Sort
    print("\nQuick Sort:")
    quick_sorted = quick_sort(original_array)
    print_array(quick_sorted)
    
    # Display original array again for comparison
    print("\nOriginal array (unchanged):")
    print_array(original_array)

if __name__ == "__main__":
    main()
