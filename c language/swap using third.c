// wap to swap two numbers using third variable in c
#include<stdio.h>
 main()
{
	int a,b,temp;
	printf("Enter the value of a and b: \n");
	scanf("%d %d",&a,&b);
	printf("\n before swapping a=%d, b=%d",a,b);
	temp=a;
	a=b;
	b=temp;
	printf("\n after swapping a=%d, b=%d",a,b);
	
	
}
