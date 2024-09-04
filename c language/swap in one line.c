#include<stdio.h>
main()
{
	int a=5, b=4;
	//printf("The value of A:%d\nThe value of B:%d", b, a);
	a=((a+b)-(b=a));
	printf("a=%d and b=%d",a,b);
}

