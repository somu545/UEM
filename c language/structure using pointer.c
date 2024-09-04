/* structure using Pointer */
#include<stdio.h>
struct book
{
	int page;
	float price;
	char name[10];
};
main()
{
	struct book b,*x;
	b.page=10;
	b.price=234.765;
	printf("\n Enter the name of the book:");
	scanf("%s",&b.name);
	
	x=&b; //assign structure to a pointer
	printf("\n %d",x->page);
	printf("\n %f",x->price);
	printf("\n %s",x->name);	
}
