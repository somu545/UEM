def check_season(month):
    month_lower = month.lower()

    if month_lower in ['december', 'january', 'february']:
        return 'Winter'
    elif month_lower in ['march', 'april', 'may']:
        return 'Spring'
    elif month_lower in ['june', 'july', 'august']:
        return 'Summer'
    elif month_lower in ['september', 'october', 'november']:
        return 'Autumn'
    else:
        return 'Invalid month'

# Example usage:
print(check_season('March'))    # Output: Spring
print(check_season('August'))   # Output: Summer
print(check_season('November')) # Output: Autumn
print(check_season('January'))  # Output: Winter
