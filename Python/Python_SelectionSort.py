def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

def main():
    try:
        with open('input.txt', 'r') as file:
            line = file.readline()
            numbers = line.split(',')
            arr = [int(num.strip()) for num in numbers]
            
        print("Original array:", arr)
        sorted_arr = selection_sort(arr)
        print("Sorted array:", sorted_arr)
        
    except FileNotFoundError:
        print("Error: input.txt not found.")
    except ValueError:
        print("Error: Invalid number in input.txt.")

if __name__ == "__main__":
    main()
