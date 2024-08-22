import java.util.Scanner;
class Exception {
public static void main(String args[]) {
int d, a;
Scanner sc= new Scanner(System.in);
try { // monitor a block of code.
System.out.println("Enter a value: ");
d = sc.nextInt();
a = 42 / d;
System.out.println(a);
System.out.println("This will not be printed.");
} catch (ArithmeticException e) { // catch divide-by-zero error
System.out.println("Division by zero.");
}
System.out.println("After catch statement.");
} }