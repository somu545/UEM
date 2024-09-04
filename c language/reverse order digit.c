#include<stdio.h>
main()
{
	int n,x;
	printf("\n Enter the value of N:");
	scanf("%d",&n);
	printf("\n the reverse order is : ");
	while(n>0)
	{
		x=n%10;//remainder
		printf("%d",x);
		n=n/10;//quotient
	}
	
	
}

