
def count_digits(number):
    # Handle negative numbers by taking the absolute value
    number = abs(number)
    
    # Special case for zero
    if number == 0:
        return 1
    
    # Count the number of digits
    count = 0
    while number > 0:
        count += 1
        number //= 10
    return count

# Example usage
try:
    num = int(input("Enter an integer: "))
    digit_count = count_digits(num)
    print(f"The number of digits in {num} is: {digit_count}")
except ValueError:
    print("Please enter a valid integer.")
