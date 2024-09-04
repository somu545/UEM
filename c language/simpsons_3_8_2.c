// simpson's 3/8
#include<stdio.h>
#include<math.h>

float f(float x)
{
	return 1/(sqrt(1-(x*x)));
}
main()
{
	float a, b, h, simp;
	int n, i;
	printf("\n Enter the lower and Upper limit and Subintervals: ");
	scanf("%f %f %d",&a, &b, &n);
	h= (b-a)/n;
	simp = f(a) + f(b);
	for(i=1 ; i<n ;i++)
	{
		if (i % 3 == 0)
		{
			simp = simp + 2 * f(a + i * h);
		}
		else
		{
			simp = simp +  3 * f(a + i * h);
		}
	}
	
	simp = (simp * h * 3) / 8;
	printf("\n The result is = %f",simp);
}
