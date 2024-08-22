
import java.util.Scanner;
class practiseOnLoop{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	/*
	int n,i,j;
	System.out.println("Enter row no: ");
	n=sc.nextInt();
	for(i=n;i>0;i--){
	for(j=0;j<i;j++){
		System.out.print("*");
		}
		System.out.print("\n");
		}
	
		int n,i,sum=0;
		System.out.println("Enter No of Integers: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=sum+(2*i);
		}
		System.out.println("Sum of even numbers is: "+sum);

		int n,i;
		System.out.println("Enter your number for table: ");
		n=sc.nextInt();
		for(i=1;i<=10;i++){
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}
		
		int n,i;
		System.out.println("Enter your number for table: ");
		n=sc.nextInt();
		for(i=10;i>0;i--){
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}
		
		int n,i,sum=1;
		System.out.println("Enter a Number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum*=i;
		}
		System.out.println("Factroial is: "+sum);
		
		
		int n,i,sum=0;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.printf("%d X %d = %d\n",n,i,n*i);
			sum+=n*i;
		}
		System.out.println("Sum of table is: " +sum);
	
		int n,i;
		int [] marks= new int[6];
		System.out.println("Enter marks: ");
		n=sc.nextInt();
		for(i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int element:marks)
		{
			System.out.println(element);
		}
			*/
			
			int [][] array= new int[2][3];
			int i,j;
			for(i=0;i<array.length;i++){
				for(j=0;j<array[i].length;j++){
					System.out.print(array[i][j]);
					System.out.print(" ");
				}
				System.out.println(" ");
			}
			
					
		
	}
}

		
	
		