import java.util.Scanner;
public class jaggedArray {
   public static void main(String[] args){
      int[][] a = new int[3][];
	  int i,j;

      a[0] = new int[1];
      a[1] = new int[2];
	  a[2] = new int[3];
	  

      Scanner sc = new Scanner(System.in);
      //initializing array
	  System.out.println("Enter inputs: ");
      for(i=0; i < a.length; i++){

         for(j=0; j < a[i].length; j++){
            a[i][j] = sc.nextInt();
         }
      }

      //printing array
	  System.out.println("printing output: ");
      for(i=0; i < a.length; i++){
         System.out.println();
         for(j=0; j < a[i].length; j++){
            System.out.print(a[i][j] + " ");
         }
      }
   }
}