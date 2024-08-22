class Animal
{  
	String color="white";  
}  
class Dog extends Animal
{  
	String color="black"; 
	//String cr=super.color;
	void printColor()
	{  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
}
 
class cat extends Dog
{
	String color="blue";
	void displayColor()
	{  
	  super.printColor();
		System.out.println(color); 
		//System.out.println(cr);
	}
}
class TestSuper2
{  
public static void main(String args[])
{  
cat d=new cat(); 
//d.printColor(); 
d.displayColor();  
}
}