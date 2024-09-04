#include<stdio.h>
main()
{
	int i,j,n,temp,p[30],bt[30],ct[30],tat[30],wt[30],ttat=0,twt=0;
	float atat,awt;
	printf("\n Enter the number of process: ");
	scanf("%d",&n);
	printf("Enter the  processs-> ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&p[i]);
	}
	printf("\n Enter the Burst time: ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&bt[i]);
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(bt[j]>bt[j+1])
			{
				temp=bt[j];
				bt[j]=bt[j+1];
				bt[j+1]=temp;
			}
		}
	}

ct[0]=0+bt[0];

for(i=1;i<n;i++)
ct[i]=ct[i-1]+bt[i];


for(i=0;i<n;i++)
tat[i]=ct[i]-0;

for(i=0;i<n;i++)
wt[i]=tat[i]-bt[i];


printf("\n PID\t  BT\t  CT\t  TAT\t  WT\n");
for(i=0;i<n;i++)
printf("%d    \t%d    \t%d    \t%d    \t%d    \t%d",p[i],bt[i],ct[i],tat[i],wt[i]);

for(i=0;i<n;i++)
{
	ttat=ttat+tat[i];
	twt=twt+wt[i];
}
 printf("\n Total TAT=%d  \n Total WT = %d",ttat,twt);
 
 
   atat = ttat / (n * 1.0);
    awt = twt / (n * 1.0);
    
    printf("\n Average TAT = %f  \n Average WT = %f",atat,awt);
    return 0;
}     
	
