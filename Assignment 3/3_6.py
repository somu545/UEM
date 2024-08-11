def compute_series_sum(n):
    if n <= 0:
        raise ValueError("The value of n must be a positive integer.")

    series_sum = 0
    for i in range(1, n + 1):
        if i % 2 == 0:
            series_sum -= 1 / i
        else:
            series_sum += 1 / i

    return series_sum

# Example usage:
try:
    n = int(input("Enter a positive integer: "))
    result = compute_series_sum(n)
    print(f"The sum of the series up to {n} terms is: {result}")
except ValueError as e:
    print(e)
