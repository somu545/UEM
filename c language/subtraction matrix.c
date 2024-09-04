/* Subtraction of two matrices. */

#include<stdio.h>
main()

{
	int a[100][100],b[100][100],c[100][100],i,j,m,n;
	
	printf("Enter the number of rows : ");
	scanf("%d",&m);
	printf("Enter the number of columns : ");
	scanf("%d",&n);
	
	printf("\nEnter the data into the 1st matrix : \n");
	for(i=0;i<m;i++)
  {
	for(j=0;j<n;j++)
	{
		scanf("%d",&a[i][j]);
	}
  }
  
  	printf("\nEnter the data into the 2nd matrix : \n");
	for(i=0;i<m;i++)
  {
	for(j=0;j<n;j++)
	{
		scanf("%d",&b[i][j]);
	}
  }
  
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
		}
	}
	printf("\nThe deference of two matrices are  : \n");
	for(i=0;i<m;i++)
  {
	for(j=0;j<n;j++)
	{
		printf("\t%d",c[i][j]);
	}
	printf("\n");
  }
}
