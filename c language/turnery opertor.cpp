#include<stdio.h>
main()
{
	int a,b,c,s;
	printf("\n Enter 1 for ADDITION");
	printf("\n Enter 2 for SUBTRACTION");
	printf("\n ENter 3 for MULTIPLICATION");
	printf("\n ENTER 4 for SUBTRACTION");
	printf("\n");
	
	printf("\n Enter the value of A:");
	scanf("%d",&a);
	printf("\n Enter the value of B:");
	scanf("%d",&c);
	
	printf("\n Enter your choice");
	scanf("%d",&c);
	
	switch(c)
	{
		case 1: s=a+b;
		printf("\n sum is %d",s);
		break;
		case 2: s=a-b;
		printf("\n sub is %d",s);
		break;
		case 3: s=a*b;
		printf("\n multi is %d",s);
		break;
		case 4: s=a/b;
		printf("\n div is %d",s );
		break;
		default:printf("\n invalid choice");
		
	}
	
}
