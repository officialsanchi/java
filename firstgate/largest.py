def largest(array):
	largest_num =array [0]

	for number in array:

		if number > largest_num:
			largest_num = number
	return largest_num

print(largest([1, 23, 50, 35, 60, 3,]))
	