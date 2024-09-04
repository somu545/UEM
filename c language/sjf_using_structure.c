//SJF -Shortest Job First
#include<stdio.h>
struct sjf{
    int id, bt, ct, tat, wt;
};

int main()
{
	struct sjf p[10];
	int i,j,n,ttat=0,twt=0,temp;
	float awt,atat;
	
	printf("\n 1.FCFS\n 2.SJF \n 3.Exit\n");
	
	printf("Enter the number of process: ");
	scanf("%d",&n);

	printf("\n Enter the Burst time: ");
	for(i=0;i<n;i++)
	{
		p[i].id=i;
		scanf("%d",&p[i].bt);
	}

	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(p[j].bt > p[j+1].bt)
			{
				temp=p[j].bt;
				p[j].bt=p[j+1].bt;
				p[j+1].bt=temp;
				
				temp=p[j].id;
				p[j].id=p[j+1].id;
				p[j+1].id=temp;
			}
		}
	}

    // calculating of completion time (ct)
    p[0].ct =p[0].bt;
    for(i = 1 ; i < n; i++)
        p[i].ct = p[i-1].ct + p[i].bt;
    
    //calculation  of turnaroundtime (tat)
    
    for(i = 0; i < n; i++)
        p[i].tat = p[i].ct;
    
    //calculation of waiting time
    for(i = 0; i < n; i++)
        p[i].wt = p[i].tat - p[i].bt;

    printf("P_ID\tP_BT\tP_CT\tP_TAT\tP_WT\n");
    for(i = 0; i < n; i++)
     printf("%d\t%d\t%d\t%d\t%d\n",p[i].id,p[i].bt,p[i].ct,p[i].tat,p[i].wt);
    
    // calculating of total TAT and total wt
    for(i = 0; i < n; i++)
    {
        ttat = ttat + p[i].tat;
        twt = twt + p[i].wt;
    }
     printf("\n Total TAT=%d  \n Total WT = %d",ttat,twt);
      
    // calculating average TAT and wt.
    atat = ttat / (n * 1.0);
    awt = twt / (n * 1.0);
    
    printf("\naverage TAT = %f  \naverage WT = %f",atat,awt);
    return 0;
}
