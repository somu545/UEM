#include <stdio.h>

int main() {

    int size = 5;
     int sum = 0;
    int arr[] = {1, 2, 3, 4, 5};
    
    for (int i = 0; i < size; i++) {
        sum += arr[i];
    }
    printf("Sum of the array elements: %d\n", sum);

    return 0;
}

