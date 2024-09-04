#include<stdio.h>
main()
{
	int n,x,s=0;
	printf("\n Enter the value of N:");
	scanf("%d",&n);
	while(n>0)
	{
		x=n%10;
		s=s+x;
		n=n/10;
	}
	printf("\n sum is = %d",s);
}
