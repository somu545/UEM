def print_pyramid(n):
    if n < 2:
        raise ValueError("N must be 2 or greater.")

    for i in range(1, n + 1):
        spaces = ' ' * (n - i)
        if i == 1:
            print(spaces + '.')
        elif i == n:
            underscores = '_' * (2 * (i - 1) - 1)
            print(spaces + '/' + underscores + '\\')
        else:
            spaces_inside = ' ' * (2 * (i - 1) - 1)
            print(spaces + '/' + spaces_inside + '\\')

# Example usage:
try:
    n = int(input("Enter the number of lines (N) for the pyramid (N >= 2): "))
    print_pyramid(n)
except ValueError as e:
    print(e)
