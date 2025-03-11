def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_index = i
        for j in range(i+1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]

def read_input_file(filename):
    with open(filename, "r") as file:
        data = list(map(int, file.read().split(",")))
    return data

def main():
    input_file = "input.txt"
    arr = read_input_file(input_file)
    selection_sort(arr)
    print("Sorted using Selection Sort:", arr)

if __name__ == "__main__":
    main()

