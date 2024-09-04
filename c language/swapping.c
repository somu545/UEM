// write a programme to swap two values without using third

#include<stdio.h>
main()
{
	int a,b;
	printf("\n Enter the value of A:");
	scanf("%d",&a);
	printf("\n Enter the value of B:");
	scanf("%d",&b);
	
	printf("\n Before swapping:a=%d b=%d",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\n After swapping:a=%d b=%d",a,b);
}

