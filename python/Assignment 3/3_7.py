import math

def factorial(n):
    """Calculate the factorial of a non-negative integer n."""
    if n == 0:
        return 1
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

def compute_sin(x, n):
    """Compute sin(x) using the first n terms of its Taylor series expansion."""
    sine_sum = 0
    for i in range(n):
        # Each term in the series is given by (-1)^i * x^(2i+1) / (2i+1)!
        term = ((-1)**i) * (x**(2 * i + 1)) / factorial(2 * i + 1)
        sine_sum += term
    return sine_sum

# Example usage:
try:
    x = float(input("Enter the value of x (in radians): "))
    n = int(input("Enter the number of terms n: "))
    
    if n <= 0:
        raise ValueError("The number of terms n must be a positive integer.")
    
    result = compute_sin(x, n)
    print(f"The computed value of sin({x}) using {n} terms is: {result}")
    print(f"The value of sin({x}) using math.sin() is: {math.sin(x)}")
except ValueError as e:
    print(e)
