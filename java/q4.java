
//Write a program to convert 69 o F into its equivalent centigrade temperature.
class java
{
	float fa;
	float c;
	void set_data()
	{
		fa=69;
		}
		void sum()
		{
		c=(fa-32)/9;
		}
		void display()
		{
			System.out.print("Centigrate Temperature is- "+c);
			}
			}
			class q4
			{
			public static void main(String args[])
			{
				java obj = new java();
				obj.set_data();
				obj.sum();
				obj.display();
				}
				}
				