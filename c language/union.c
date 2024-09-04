#include<stdio.h>
#include<string.h>

union book
{
	int page;
	float price;
	char name[20];
};

main()
{
	union book b;
	
	printf("\n Enter the total Page No. ");
	scanf("%d",&b.page);
	printf("\n The total Page No. is  %d",b.page);
	
	printf("\n Enter the price. ");
	scanf("%f",&b.price);
	printf("\n The price is %f",b.price);
	
	printf("\n Enter the Author Name ");
	//scanf("%s",b.name);
	fflush(stdin);
	gets(b.name);
	printf("\n The Author Name is ");
	puts(b.name);
}
