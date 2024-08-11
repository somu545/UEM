def generate_multiplication_table(number):
    print(f"Multiplication Table for {number}")
    for i in range(1, 11):
        print(f"{number} * {i} = {number * i}")

# Example usage
try:
    number = int(input("Enter a number to generate its multiplication table: "))
    generate_multiplication_table(number)
except ValueError:
    print("Please enter a valid integer.")
