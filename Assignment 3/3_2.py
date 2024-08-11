def calculate_slope(x1, y1, x2, y2):
    if x1 == x2:
        raise ValueError("The slope is undefined for vertical lines where x1 == x2.")
    
    return (y2 - y1) / (x2 - x1)


try:
    print(calculate_slope(1, 2, 3, 4))   
    print(calculate_slope(2, 3, 2, 6))   
except ValueError as e:
    print(e)
