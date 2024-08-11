def is_prime(number):
    if number <= 1:
        return False
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False
    return True

# Example usage
try:
    num = int(input("Enter a number: "))
    if is_prime(num):
        print(f"The number {num} is a prime number.")
    else:
        print(f"The number {num} is not a prime number.")
except ValueError:
    print("Please enter a valid integer.")
