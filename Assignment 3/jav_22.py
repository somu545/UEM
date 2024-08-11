def print_multiples_of_10(start, end):
    if start > end:
        print("Invalid interval: start should be less than or equal to end.")
        return

    multiples = [num for num in range(start, end + 1) if num % 10 == 0]
    print("Multiples of 10 between {} and {}:".format(start, end), multiples if multiples else "None")

# Example usage
try:
    start = int(input("Enter the start of the interval: "))
    end = int(input("Enter the end of the interval: "))
    print_multiples_of_10(start, end)
except ValueError:
    print("Please enter valid integers for the interval.")
