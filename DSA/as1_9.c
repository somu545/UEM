#include <stdio.h>

int main() {
    int size = 5,i;
    int arr[] = {1, 2, 3, 4, 5};

    printf("Original Array: ");
     for (i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    
    printf("\nReverse Array: ");
    for(i = size-1; i>= 0; i--){
    	printf("%d ",arr[i]);
	}

    return 0;
}

