//Write a program to calculate simple and compound interest.

#include<stdio.h>
#include<math.h>
main()
{
	float p,r,t,a,si,ci;
	printf("\ Enter principl=");
	scanf("%f",&p);
    printf("\ Enter Rate=");
	scanf("%f",&r);
    printf("\ Enter Time=");
	scanf("%f",&t);
	
	si=(p*r*t)/100;
	
	printf("simple Interest=%f",si);
	a=p*(pow((1+r/100), t));
	ci= a-p;
	printf("\n Compound interest=%f",ci);
}
