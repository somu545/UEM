import java.util.Scanner;
class Rectanlge{
	float area1,area2;
	Scanner sc = new Scanner(System.in);
	void rectangle(float w,float l) {
		System.out.println("Enter width: ");
		w=sc.nesxtFloat();
		System.out.println("Enter Length: ");
		l=sc.nesxtFloat();
	}
	void square(Float a)
	{
		System.out.println("Enter area: ");
		a=sc.nesxtFloat();
	}
	void area()
	{
		area1=l*w;
		return area1;
		area2=a*a;
		return area2;
	}
		
}
public class session4_q2 {
	public static void main(String args[]) {
		Rectanlge obj = new Rectanlge();
		obj.rectangle();
		obj.square();
		obj.area();
	
	}
}