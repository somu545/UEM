// simpson's 1/3 rd

#include<stdio.h>
#include<math.h>


float f(float x)
{
	return (sqrt(1-(x*x*x)));
}
main()
{
	float a,b,h,z,simp=0;
	int i,n;
	
	printf("\n Enter the lower limit,Upper limit and number of steplength: ");
	scanf("%f %f %f",&a,&b,&h);
	
	n = (b-a)/h;
	
	simp = f(a) + f(b);
	
	for(i=1; i<=n-1; i=i+2)
	{
		simp = simp + 4 * f(a + i *h);
	}
	for(i=2; i<=n-2; i=i+2)
		{
			simp = simp + 2 * f(a+ i *h);
		}
	
	simp = (simp * h) / 3;
	
	printf("\n The result is : %f",simp);
}
