#include <stdio.h>

void readMatrix(int matrix[10][10], int rows, int cols) {
    printf("Enter the elements of the matrix:\n");

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }
}

void displayMatrix(int matrix[10][10], int rows, int cols) {
    printf("Matrix:\n");

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }
}

int isMultiplicationPossible(int cols1, int rows2) {
    return cols1 == rows2;
}

void multiplyMatrices(int mat1[10][10], int mat2[10][10], int result[10][10], int rows1, int cols1, int rows2, int cols2) {
    for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < cols2; j++) {
            result[i][j] = 0;

            for (int k = 0; k < cols1; k++) {
                result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
}

int main() {
    int mat1[10][10], mat2[10][10], result[10][10];
    int rows1, cols1, rows2, cols2;

 
    printf("Enter the number of rows for the first matrix: ");
    scanf("%d", &rows1);
    printf("Enter the number of columns for the first matrix: ");
    scanf("%d", &cols1);

    printf("Enter the number of rows for the second matrix: ");
    scanf("%d", &rows2);
    printf("Enter the number of columns for the second matrix: ");
    scanf("%d", &cols2);

    if (!isMultiplicationPossible(cols1, rows2)) {
        printf("Matrix multiplication is not possible!\n");
        return 1;
    }

    readMatrix(mat1, rows1, cols1);
    readMatrix(mat2, rows2, cols2);


    multiplyMatrices(mat1, mat2, result, rows1, cols1, rows2, cols2);

    printf("\nMatrix 1:\n");
    displayMatrix(mat1, rows1, cols1);

    printf("\nMatrix 2:\n");
    displayMatrix(mat2, rows2, cols2);

    printf("\nResultant Matrix after multiplication:\n");
    displayMatrix(result, rows1, cols2);

    return 0;
}

