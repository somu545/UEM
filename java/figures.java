/*3) Write a program to display the following figures:
a) *
* *
* * *
* * * *
* * * * *
*/


import java.util.Scanner;
class figures
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,row;
		
		System.out.println("Enter number of rows: ");
		
		row=sc.nextInt();
		
		for(i=1;i<=row;i++){
			
		for(j=1;j<=i;j++){
			
		System.out.print(" * ");
		}
		System.out.println();
	}
}
}