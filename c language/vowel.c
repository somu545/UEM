#include<stdio.h>
main()
{
	char a;
	printf("\n Enter the character:");
	scanf("%c",&a);
	if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u')
	{
		printf("%c is vowel",a);
	}
	else
	{
		printf("%c is consonent",a);
	}
}
