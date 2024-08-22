//Take two integer variables x and y, where x=10 and y=20. Write a program to display
//the sum of these two variables.

class java
{
	int x,y,z;
	void set_data()
	{	x=10;
		y=20;
		}
		void sum()
		{
		z=x+y;
		}
		void display()
		{
			System.out.println("The sum is -"+z);
			}
			}
			class q2
			{
			public static void main(String args[])
			{
				java obj=new java();
				obj.set_data();
				obj.sum();
				obj.display();
				}
				}