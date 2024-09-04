//Trapizoidal

#include<stdio.h>
#include<math.h>

float f(float x)
{
	return (x* exp(x));
}
main()
{
	float a,b,h,trap=0;
	int i,n;
	
	printf("\n Enter the lower limit,Upper limit and number of subintervals: ");
	scanf("%f %f %d",&a,&b,&n);
	h=(b-a)/n;
	trap = f(a) + f(b);
	for(i=1; i<=n-1; i++)
	{
		trap = trap +2*f(a + i * h);
	}
	trap = trap * h / 2;
	
	printf("\n The result is : %f",trap);
}
