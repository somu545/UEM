import cmath

def solve_quadratic_eqn(a, b, c):
    if a == 0:
        raise ValueError("Coefficient 'a' must not be zero in a quadratic equation.")

    discriminant = b**2 - 4*a*c
    

    root1 = (-b + cmath.sqrt(discriminant)) / (2 * a)
    root2 = (-b - cmath.sqrt(discriminant)) / (2 * a)
    

    if discriminant >= 0:
        return (root1.real, root2.real)
    else:
        return (root1, root2)


try:
    print(solve_quadratic_eqn(1, -3, 2))
    print(solve_quadratic_eqn(1, 2, 1))   
    print(solve_quadratic_eqn(1, 0, 1))  
except ValueError as e:
    print(e)
