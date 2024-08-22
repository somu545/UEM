#include<stdio.h>

void find(int arr[],int n){
	int largest = arr[0];  
    int slargest = arr[1]; 

    // Find the firstMax and secondMax
    for (int i = 2; i < n; i++) {
        if (arr[i] > largest) {
            slargest = largest;
            largest = arr[i];
        } else if (arr[i] > slargest && arr[i] != largest) {
            slargest = arr[i];
        }
    }

    printf("The second highest number in the array is: %d\n", slargest);
    printf("largest: %d",largest);
}
int main() {
    int n;

    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    find(arr,n);
//
//    int largest = arr[0];  
//    int slargest = arr[1]; 
//
//    // Find the firstMax and secondMax
//    for (int i = 2; i < n; i++) {
//        if (arr[i] > largest) {
//            slargest = largest;
//            largest = arr[i];
//        } else if (arr[i] > slargest && arr[i] != largest) {
//            slargest = arr[i];
//        }
//    }
//
//    printf("The second highest number in the array is: %d\n", slargest);
//    printf("largest: %d",largest);

    return 0;
}
