def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr

def main():
    try:
        with open('input.txt', 'r') as file:
            line = file.readline()
            numbers = line.split(',')
            arr = [int(num.strip()) for num in numbers]
            
        print("Original array:", arr)
        sorted_arr = bubble_sort(arr)
        print("Sorted array:", sorted_arr)
        
    except FileNotFoundError:
        print("Error: input.txt not found.")
    except ValueError:
        print("Error: Invalid number in input.txt.")

if __name__ == "__main__":
    main()
