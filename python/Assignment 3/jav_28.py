def is_palindrome(number):
    # Convert the number to a string
    num_str = str(number)
    
    # Check if the string is equal to its reverse
    return num_str == num_str[::-1]

# Example usage
try:
    num = int(input("Enter a number: "))
    if is_palindrome(num):
        print(f"The number {num} is a palindrome.")
    else:
        print(f"The number {num} is not a palindrome.")
except ValueError:
    print("Please enter a valid integer.")

