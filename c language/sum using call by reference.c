// Q1. Add two num using call by referance, supplyed by the user.

#include<stdio.h>

main(){
	void sum(int *, int *);
	
	int x = 10, y = 99;
	printf("Enter Number X: ");
	scanf("%d", &x);
	printf("Enter Number Y: ");
	scanf("%d", &y);
	
	sum(&x, &y);
	
	printf("\n Sum is: %d", x);
	
}
void sum(int *x, int *y){
	*x = *x + *y;
}
