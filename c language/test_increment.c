#include <stdio.h>  
#include <conio.h>  
int main ()  
{  
    // declare integer variables  
    int  d, x , y, z; 
      
    // if x=3, y=5, and z=10:
 //++z + y - y + z + x++
    x = 3 ; 
    y = 5;  
    z = 10;  
      
    d = ++z + y - y + x++;  
      
    // print the updated value of a, b, c, and d  
    printf (" \n The updated value of d = %d", d);  
    return 0;     
}  
