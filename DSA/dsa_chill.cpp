#include<stdio.h>
//#include<stdlib.h>
//int main(){
//	int n,i;
//	printf("Enter size of the array: ");
//	scanf("%d",&n);
//	int *arr = (int*)malloc(n*sizeof(int));
//	
//	for(i=0;i<n;i++){
//		scanf("%d",&arr[i]);
//	}
//	for(i=0;i<n;i++){
//		printf("%d",arr[i]);
//	}
//	
//	
//}

int main(){
	int i ;
	int arr[] = {1,2,3,4};
	for(i= 100; i<=103;i++){
		scanf("%d",&arr[i]);
	}
		for(i= 0;i< 4;i++){
		printf("%d",arr[i]);
	}
	
	
	
	return 0;
}
