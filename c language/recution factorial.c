// factorial of n natural numbers using recustion

#include<stdio.h>
main()
{
	int n,f;
	printf("\n Enter the value of N:");
	scanf("%d",&n);
	f=fun1(n);
	printf("\n The sum is :%d",f);
}
int fun1 (int a)
{
	int f=1;
	if(a!=0)
	{
		return(a*fun1(a-1));
	}
	else
	{
		return(1);
	}
}
