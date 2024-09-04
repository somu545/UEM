//Srtf - Shortest remaining time first

#include<stdio.h>

struct srtf{
	int id,at,bt,ct,tat,wt;
};

main()
{
	struct srtf p[10];
	int i,j,n,ttat=0,twt=0,temp;
	
	printf("\n Enter the number of process: ");
	scanf("%d",&n);
	
	    for(i = 0; i < n; i++)
    {
        printf("Enter the Arrival time and brust time for process %d  : ",i);
        scanf("%d%d",&p[i].at,&p[i].bt);
        p[i].id = i; 
	}
	
	for(i = 0;i < n; i++)
	{
		for(j= 0; j < n-i-1; j++)
		{
			if(p[j].at > p[j+1].at);
			{
				temp = p[j].at;
				p[j].at = p[j+1].at;
				p[j+1].at = temp;
				
				temp = p[j].bt;
				p[j].bt = p[j+1].bt;
				p[j+1].bt = temp;
				
				temp = p[j].id;
				p[j].id = p[j+1].id;
				p[j+1].id = temp;
			}
		}
	}
	
	


	
	
	
}
