def countingSort(arr):
	max_val = max(arr)
	count = [0] * (max_val + 1)
	
	while len(arr) > 0:
		num = arr.pop(0)
		count[num] += 1
	
	for i in range(len(count)):
		while count[i] > 0:
			arr.append(i)
			count[i] -= 1

	return arr

unsortedArr = [64, 34, 25, 12, 22, 11, 90, 45, 73, 51, 38, 82, 17, 9, 62]
sortedArr = countingSort(unsortedArr)
print("Sorted Array: ", sortedArr)
