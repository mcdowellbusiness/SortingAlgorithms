# Sorts a default array by iteratively taking a value and inserting it into the
# first position where it is larger than all previous values
def insertionSort(arr):
    n = len(arr)  # Get the length of the array
     
    if n <= 1:
        return  # If the array has 0 or 1 element, it is already sorted, so return

    for i in range(1, n):  # Iterate over the array starting from the second element
        key = arr[i]  # Store the current element as the key to be inserted in the right position
        j = i-1
        while j >= 0 and key < arr[j]:  # Move elements greater than key one position ahead
            arr[j+1] = arr[j]  # Shift elements to the right
            j -= 1
        arr[j+1] = key  # Insert the key in the correct position

def main():
    try:
        with open('input.txt', 'r') as file:
            line = file.readline()
            numbers = line.split(',')
            arr = [int(num.strip()) for num in numbers]
            
        print("Original array:", arr)
        insertionSort(arr)
        print("Sorted array:", arr)
        
    except FileNotFoundError:
        print("Error: input.txt not found.")
    except ValueError:
        print("Error: Invalid number in input.txt.")

if __name__ == "__main__":
    main()
