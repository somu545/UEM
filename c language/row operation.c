/*
A
AB
ABC
ABCD
ABCDE
*/
#include<stdio.h>

main()
{
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		k=1;
		for(j=1;j<=i;j++)
		{
			printf(" %d ",k);
			k++;
		}
		printf("\n");
	}
	
}
