/* To read  data from a file using C Programming */

#include<stdio.h>
main()
{
	FILE *fp; // File Pointer
	int age;
	char name[30];
	float bs;
	
	fp=fopen("Emp1.txt","r");  // fopen("file name","mode"); w= write mode
	if(fp==NULL)
	{
		fclose(fp);
		printf("\n Cannot Open File");
		exit(0);	
	}	
	
	while(fscanf(fp,"%s %d %f",name,&age,&bs)!=EOF)
	{
		
		printf("%s %d %f\n",name,age,bs); // data insert using keyboard 
	}
	fclose(fp);
}
