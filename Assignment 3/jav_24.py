def compute_hcf(x, y):
    while y:
        x, y = y, x % y
    return x

# Example usage
try:
    num1 = int(input("Enter the first number: "))
    num2 = int(input("Enter the second number: "))
    hcf = compute_hcf(num1, num2)
    print(f"The HCF of {num1} and {num2} is: {hcf}")
except ValueError:
    print("Please enter valid integers.")
