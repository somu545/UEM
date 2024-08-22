import java.util.Scanner;
class A
{
	Scanner sc = new Scanner(Sytem.in);
	float i,f,i1,f1,inch,feet;
	void set_data()
	{
		System.out.println("Enter Data for Inch: ");
		inch=sc.nextFloat();
		System.out.println("Enter data for Feet: ");
		feet=sc.nextFloat();
		System.out.println("Enter 2ndData for Inch: ");
		inch1=sc.nextFloat();
		System.out.println("Enter d2ndata for Feet: ");
		feet1=sc.nextFloat();
	}
	void inchConversion()
	{
		inch=i+i1;
		feet=f+f1;
		feet3= inch3/12;
	}
	void display()
	{
		System.out.println("Value in Feet is" +feet3);
	}
}

class InchtoFeet
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.set_data();
		obj.inchConversion();
		obj.display();
	}
}

		