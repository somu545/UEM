import java.util.*;

abstract class a{
    abstract void get_data();
}

interface b
{
	 void sum(); 
}
class c extends a implements b
{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
	   public void get_data(){
        System.out.print("Enter A : ");
		a = sc.nextInt();
		System.out.print("Enter B : ");
		b = sc.nextInt();
		
    }
    public void sum(){
        c = a+b;
		System.out.println("sum is -> "+c);
	}
}

class abstract_class{
    public static void main(String[] args) {
       c obj = new c();
		obj.get_data();
		obj.sum();
    }
}
