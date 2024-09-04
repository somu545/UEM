//swap two values using call by reference
#include<stdio.h>
main()
{
	void fun(int*,int*);
	int a=8,b=5;
	printf("\n In main()--->Before swapping a=%d,b=%d",a,b);
	fun(&a,&b);
	printf("\n In main()--->After swapping a=%d,b=%d",a,b);
	
}
void fun(int* x,int* y)
{
	int z;
	printf("\n In function fun()----> Before swapping a=%d,b=%d",*x,*y);
	z=*x;
	*x=*y;
	*y=z;
	printf("\n In function fun()---->After swapping a=%d,b=%d",*x,*y);
}
