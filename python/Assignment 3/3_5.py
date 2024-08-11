def reverse_list(arr):
    reversed_arr = []
    for i in range(len(arr) - 1, -1, -1):
        reversed_arr.append(arr[i])
    return reversed_arr

example_list = [1, 2, 3, 4, 5]
reversed_example_list = reverse_list(example_list)
print(reversed_example_list)  # Output: [5, 4, 3, 2, 1]
