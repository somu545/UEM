def sum_of_natural_numbers(n):
    if n < 1:
        return 0
    return n * (n + 1) // 2

# Example usage
try:
    n = int(input("Enter a positive integer: "))
    if n < 1:
        raise ValueError("The number must be a positive integer.")
    sum_n = sum_of_natural_numbers(n)
    print(f"The sum of natural numbers up to {n} is: {sum_n}")
except ValueError as e:
    print(e)
