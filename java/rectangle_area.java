import java.util.Scanner;
class Calculate_area {
	float length, width, area;
	Scanner sc = new Scanner(System.in);
	void setData() {
		float l, w;
		System.out.print("\nEnter length of the rectangle: ");
		l = sc.nextFloat();
		System.out.print("\nEnter width of the rectangle: ");
		w = sc.nextFloat();
		this.length = l;
		this.width = w;
	}
	void area() {
		area = length * width;
	}
	void showData() {
		System.out.println("The area: "+area);
	}
}
public class Rectangle_area {
	public static void main(String args[]) {
		Calculate_area cal = new Calculate_area();
		cal.setData();
		cal.area();
		cal.showData();
		Calculate_area cal2 = new Calculate_area();
		cal2.setData();
		cal2.area();
		cal2.showData();
	}
}