// simpson's 3/8 rd

#include<stdio.h>
#include<math.h>


float f(float x)
{
	 return 1 / (sqrt(1-(x*x)));
}
main()
{
	float a,b,h,z,simp=0;
	int i,n;
	
	printf("\n Enter the lower limit,Upper limit and number of subintervals: ");
	scanf("%f %f %d",&a,&b,&n);
	
	h = (b-a)/n;
	
	simp = f(a) + f(b);
	
	for(i=1; i<=n; i++)
	{
		{
			if(i % 3 == 0)
			{
				simp = simp + 2 *(a +i * h);
			}
			else
			{
				simp = simp + 3 *(a +i * h);	
			}
			
		}
	simp = (3 * h / 8) * simp;
	
	printf("\n The result is : %f",simp);
}
