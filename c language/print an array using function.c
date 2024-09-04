//pass a value from an array using function

#include<stdio.h>
main()
{
	void fun1(int);
	int a[5],i;
	printf("\n Enter the data into the function\n");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n The output is :");
	for(i=0;i<5;i++)
	{
		fun1(a[i]);
	}
	
}
void fun1(int x)

{
	printf("\n the value is :%d",x);
}

