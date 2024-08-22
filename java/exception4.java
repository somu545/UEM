import java.util.Scanner;
class exception4 {
   public static void main (String args[]) {
   
   int a,b,c,size,i;
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter value of a: ");
	a=sc.nextInt();
	System.out.println("Enter value of b: ");
	b=sc.nextInt();
	
     
      try {
         c = a/b;
         System.out.println("The result is" +c);
         for(i = 0; i < 6; i++) {
            System.out.println("The value of array is" +arr[i]);
         }
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds"+e);
      } catch (ArithmeticException e) {
         System.out.println ("Can't divide by Zero"+e);
      }
   }
}