

-------------------------bubble sort----------------------------------------------------

#include <stdio.h>  
//  
//void bubble_sort(int arr[], int n) {  
//  int i, j;  
//  for (i = 0; i < n - 1; i++) {  
//    for (j = 0; j < n - i - 1; j++) {  
//      if (arr[j] > arr[j + 1]) {  
//        int temp = arr[j];  
//        arr[j] = arr[j + 1];  
//        arr[j + 1] = temp;  
//      }  
//    }  
//  }  
//}  

//-------------------------------insertion sort-------------------------------------------------

//void insertion(int a[],int n,int e,int c){
//	int i,j,temp;
//	for(i=1;i<n;i++){
//		temp = a[i];
//		j= i-1;
//		
//		while(i >= 0 && a[j]>temp){
//			a[j+1] = a[j];
//			j--;
//		}
//		a[j+1] = temp;
//		
//	}
//}

--------------------------------------------selection sort--------------------------------------------------


//void swap(int *x, int *y){
//	int temp;
//	temp = *x;
//	*x = *y;
//	*y = temp;
//}
//
//void selection(int a[],int n){
//	int i,j,min;
//	for(i=0;i<n-1;i++){
//		min = i;
//		for(j=i+1; j<n; j++){
//			if(a[j]<a[min]){
//				min = j;
//			}
//		}
//		if(min != i){
//			swap(&a[i], &a[min]);
//		}
//	}
//}
//
-------------------------------------------------------quick sort-----------------------------------------------------------
//void swap(int *x, int *y){
//	int temp;
//	temp = *x;
//	*x = *y;
//	*y = temp;
//}
//int partition(int a[], int l ,int h){
//	int pivot = a[l];
//	int i = l;
//	int j = h;
//	while (i < j){
//		while(a[i]<= pivot){
//			i++;
//		}
//		while(a[j] > pivot){
//			j--;
//		}
//		
//		if(i<j){
//			swap(&a[i],&a[j]);
//		}
//	}
//	
//	swap(&a[l],&a[j]);
//	return j;
//}
//
//void quicksort(int a[],int l,int h){
//	if(l<h){
//		int loc = partition(a,l,h);
//		quicksort(a,l,loc-1);
//		quicksort(a,loc+1,h);
//	}
//}

----------------------------------------------------------------merge sort------------------------------------------------------------------------------------

//void merge(int a[],int l,int mid ,int h){
//	int i = l;
//	int j = mid+1;
//	int k = l;
//	int b[10];
//	
//	while(i<=mid && j<= h){
//		if(a[i]<=a[j]){
//			b[k] = a[i];
//			i++;
//		}else{
//			b[k] = a[j];
//			j++;
//		}
//		k++;
//	}
//	
//	if(i>mid){
//		while(j<=h){
//			b[k] = a[j];
//			j++;
//			k++;
//		}
//	}else{
//		while(i<= mid){
//				b[k] = a[i];
//				i++;
//				k++;
//		}
//	}
//	
//	for(k = l; k <= h; k++){
//		a[k]= b[k];
//	}
//}
//
//void mergesort(int a[],int l,int h){	
//	if(l<h){
//		int mid = (l+h)/2;
//		mergesort(a,l,mid);
//		mergesort(a,mid+1,h);
//		merge(a,l,mid,h);
//	}
//}
int main() {  
  int arr[] = {64, 34, 25, 12, 22, 11, 90};  
  int n = sizeof(arr) / sizeof(arr[0]);  
  mergesort(arr,0,n-1);  
  printf("Sorted array: ");  
  for (int i = 0; i < n; i++) {  
    printf("%d ", arr[i]);  
  }  
  return 0;  
}  

