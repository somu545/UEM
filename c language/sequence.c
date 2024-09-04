#include<stdio.h>
#include<conio.h>
void main()
{
 int i,n,a = 0, b = 1,c;
 clrscr();
 printf("Enter the numbers \n ");
 scanf("%d", &n);
 printf("Fibonacci series\n");
 printf("%d  %d", a, b);
 for(i = 1; i<=n;i++)
 {
  c = a + b;
  printf("  %d",c);
  a = b;
  b = a;
 }
}
