import math

def factorial(n):
    """Calculate the factorial of a non-negative integer n."""
    if n == 0:
        return 1
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

def compute_cos(x, n):
    """Compute cos(x) using the first n terms of its Taylor series expansion."""
    cos_sum = 0
    for i in range(n):
        # Each term in the series is given by (-1)^i * x^(2i) / (2i)!
        term = ((-1)**i) * (x**(2 * i)) / factorial(2 * i)
        cos_sum += term
    return cos_sum

# Example usage:
try:
    x = float(input("Enter the value of x (in radians): "))
    n = int(input("Enter the number of terms n: "))
    
    if n <= 0:
        raise ValueError("The number of terms n must be a positive integer.")
    
    result = compute_cos(x, n)
    print(f"The computed value of cos({x}) using {n} terms is: {result}")
    print(f"The value of cos({x}) using math.cos() is: {math.cos(x)}")
except ValueError as e:
    print(e)
