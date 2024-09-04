#include <stdio.h>
 main() 
 {
   int a = 28, b = 8;
   a += b -= a = b - a; 
   printf("After Swapping : %d\t%d", a, b);
}
