#include<stdio.h>
struct book
{
	int page;
	float price;
	char a[10];
};
main()
{
	struct book b;
	printf("\n Enter the total number of page no:");
	scanf("%d",&b.page);
	printf("\n Enter the price of book:");
	scanf("%f",&b.price);
	printf("\n Enter the name of the book:");
	scanf("%s",b.a);
	printf("\n The output is:");
	printf("\n total no.of page :%d",b.page);
	printf("\n The price of the book:%f",b.price);
	printf("\n The name of the book is:%s",b.a);
}
