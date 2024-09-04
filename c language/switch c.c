#include <stdio.h>
int main() 
{
    int a,b,s,c;
    printf("\n Enter 1 for Sum");
    printf("\n Enter 2 for Sub");
    printf("\n Enter 3 for Mul");
    printf("\n Enter 4 for Div");
   
   printf("\n Enter your choice C ");
   scanf("%d",&c);
   printf("\n Enter the value of A: ");
   scanf("%d",&a);
   printf("\n Enter the value of B: ");
   scanf("%d",&b);
   
  switch(c)
   {
       case 1:s=a+b;
              printf("\n Sum is= %d",s);
              break;
       case 2:s=a-b;
              printf("\n Sub is= %d",s);
              break;
       case 3:s=a*b;
              printf("\n Mul is= %d",s);
              break;
      case 4:s=a/b;
              printf("\n Div is= %d",s);
              break;
      default:printf("\n Invalied choice");
                      
   }
   
   
    
}
