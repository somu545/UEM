/* 2) Write a class rectangle that has two constructors(with two arguments and one
argument) to create objects as rectangle or square. It has a method called area() that
returns the area of the corresponding object. */

import java.util.Scanner;
class Rectangle{
    float width,length,area;
    Rectangle(float w,float l) {
		width=w;
		length=l;
	}
    Rectangle(float l){
		length=l;
		width=l;
	}
	void area()
	{
	   area=width*length;
	   System.out.println("Area is:" +area);
	}
		
}
class session4_as2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float width,length,sq_length;
		System.out.println("Enter Width and length of rectangle: ");
		width=sc.nextFloat();
		length=sc.nextFloat();
		Rectangle obj = new Rectangle(length,width);
		obj.area();
		System.out.println("Enter length of Square: ");
		sq_length=sc.nextFloat();
		Rectangle obj1= new Rectangle(sq_length);
		obj1.area();
	
	}
}