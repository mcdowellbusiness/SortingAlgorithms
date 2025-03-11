# Sorts a given array by repeatedly swapping two values
# next to each other until every value has been sorted
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

def read_input_file(filename):
    with open(filename, "r") as file:
        data = list(map(int, file.read().split(",")))
    return data

def main():
    input_file = "input.txt"
    arr = read_input_file(input_file)
    bubble_sort(arr)
    print("Sorted using Bubble Sort:", arr)

if __name__ == "__main__":
    main()

