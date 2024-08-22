#include<stdio.h>
void insertion(int a[],int n,int e,int c){
	int i,j,temp;
	for(i=1;i<n;i++){
		temp = a[i];
		j= i-1;
		c++;
		while(i >= 0 && a[j]>temp){
			e++;
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = temp;
		
	}
	  printf(" \ncomp : %d",c);
  printf("\n exchsange : %d",e);
}

int main() {  
  int arr[] = {57, 27, 22, 95, 79, 45, 96};  
  int n = sizeof(arr) / sizeof(arr[0]);  
  int e = 0;
  int c = 0;
  insertion(arr,n,e,c);  
  printf("\nSorted array: ");  
  for (int i = 0; i < n; i++) {  
    printf("%d ", arr[i]);  
  }  

  return 0;  
}  


