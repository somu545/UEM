// sum of n natural numbers using recurtion
#include<stdio.h>
main()
{
	int n,f;
	printf("\n ENter the value of N:");
	scanf("%d",n);
	f=fun1(n); //call the function
	printf("\n The sum is =%d",f);
}
int fun1(int a)
{
	int f=1;
	if(a!=0)
	{
	return(a+fun1(a-1));
    } 
    else
    {
    	return(0);
	}
	
}
