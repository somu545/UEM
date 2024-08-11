#include <stdio.h>


int main() {
  
    int size = 5,flag=0;
    int arr[] = {1, 2, 3, 4,2,2};

     for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) {
                flag =  1;
            }
        }
    }
    
    if(flag){
    	printf("Array has duplicate elements");
	}else{
			printf("Array has no duplicate elements");
	}

    return 0;
}

