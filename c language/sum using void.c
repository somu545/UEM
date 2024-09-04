// sum of function using void 
#include<stdio.h>
main()
{
	int somnath(void);
	int c;
	c=somnath(); //call the function
	printf("\n sum is %d",c);
}
int somnath(void)
{
	int z,a,b;
	printf("\n Enter the value of A:");
	scanf("%d",&a);
	printf("\n Enter the value of B:");
	scanf("%d",&b);
	z=a+b;
	return(z);
}
