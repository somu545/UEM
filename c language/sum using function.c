//sum of two variables using function
#include<stdio.h>
main()
{
	int sum2(int,int);
	int a,b,c;
	printf("\n Enter the value of A:");
	scanf("%d",&a);
	printf("\n Enter the value of B:");
	scanf("%d",&b);
	c=sum2(a,b);
	printf("\n sum is =%d",c);
}
int sum2(int x,int y)
{
	int z;
	z=x+y;
	return(z);
}
