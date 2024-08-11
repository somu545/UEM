import math

def calculate_exponential(number):
    return math.exp(number)

# Example usage
try:
    num = float(input("Enter a number: "))
    result = calculate_exponential(num)
    print(f"The exponential of {num} is: {result}")
except ValueError:
    print("Please enter a valid number.")
