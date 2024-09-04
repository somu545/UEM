/* Sum of two numbers using call by referance */
#include<stdio.h>
main()
{
	void fun1(int *,int *,int *);
	int a,b,s=0;
	
	printf("\n Enter the value of A ");
	scanf("%d",&a);
	printf("\n Enter the value of B ");
	scanf("%d",&b);
	fun1(&a,&b,&s);
	printf("\n In main()-----> The Sum is %d",s);
}

void fun1(int *x,int *y,int *z)
{
	*z=*x+*y;
	printf("\n In function()-----> The Sum is %d",*z);
}
