def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less = [x for x in arr[1:] if x <= pivot]
        greater = [x for x in arr[1:] if x > pivot]
        return quick_sort(less) + [pivot] + quick_sort(greater)

def main():
    try:
        with open('input.txt', 'r') as file:
            line = file.readline()
            numbers = line.split(',')
            arr = [int(num.strip()) for num in numbers]
            
        print("Original array:", arr)
        sorted_arr = quick_sort(arr)
        print("Sorted array:", sorted_arr)
        
    except FileNotFoundError:
        print("Error: input.txt not found.")
    except ValueError:
        print("Error: Invalid number in input.txt.")

if __name__ == "__main__":
    main()
