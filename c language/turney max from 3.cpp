#include<stdio.h>
main()
{
	int m,n,max;
	printf("\n Enter the value of M:")
	scanf("%d",&m);
	printf("\n Enter the value of N:")
	scanf("%d",&n);
	max=(m>n)?m:n;
	printf("\n the max is=%d",max);
}
