//Write a program to calculate simple interest for a given P=4000, T=2, R=5.5. (I = P*T*R/100)

#include<stdio.h>
main()
{
	int p,t;
	float r,i;
	p=4000;
	t=2;
	r=5.5;
	i=p*t*r/100;
	printf("\n Simple interest=%f",i);
}
