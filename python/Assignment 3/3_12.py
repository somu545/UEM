def print_table(rows, columns):
    # Define a function to calculate the value for a given row and column
    def calculate_value(row, col):
        return row ** (col - 1)
    
    # Print the table
    for i in range(1, rows + 1):
        row_values = [str(i)]
        for j in range(1, columns):
            row_values.append(str(calculate_value(i, j)))
        print(' '.join(row_values))

# Number of rows and columns for the table
num_rows = 5
num_columns = 5

print_table(num_rows, num_columns)
