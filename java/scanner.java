import java.util.Scanner;
public class scanner{
public static void main(String[]args){
System.out.println("Taking input From the user");
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st Number: ");
int a=sc.nextInt();
System.out.println("Enter 2nd Number: ");
int b = sc.nextInt();
int sum= a+b;
System.out.println("The sum is " +sum);
}
}



