class Animal
{
	String color= "white";
}

class Dog extends Animal
{
	String color = "black";
	
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

class Cat extends Dog
{
	String color="blue";
	
	void displaycolor()
	{
		super.printcolor();
		System.out.println(color);
	}
}

class TestSuper3
{
	public static void main()
	{
		Cat obj = new Cat();
		obj.displaycolor();
	}
}