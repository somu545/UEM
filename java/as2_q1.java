//1) Write a program to check a number whether it is o dd or even.

import java.util.Scanner;

class as2_q1
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}