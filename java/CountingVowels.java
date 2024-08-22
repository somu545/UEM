
//session-3
//2) Write a program to display total number of vowels in a stri ng.

import java.util.Scanner;
class CountingVowels {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Enter a string : ");
      Scanner sc = new Scanner(System.in);
      String x = sc.nextLine();

      for (int i=0 ; i<x.length(); i++){
         char ch = x.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}