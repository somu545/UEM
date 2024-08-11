def binary_to_decimal(binary_str):
    return int(binary_str, 2)

# Example usage
binary_str = input("Enter a binary number: ")
try:
    decimal_number = binary_to_decimal(binary_str)
    print(f"The decimal representation of binary {binary_str} is {decimal_number}.")
except ValueError:
    print("Please enter a valid binary number.")

def decimal_to_binary(number):
    return bin(number).replace("0b", "")

# Example usage
try:
    num = int(input("Enter a decimal number: "))
    binary_str = decimal_to_binary(num)
    print(f"The binary representation of decimal {num} is {binary_str}.")
except ValueError:
    print("Please enter a valid integer.")
