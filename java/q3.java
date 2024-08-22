//Define the following variables and evaluate the following expressions:
//if w=100, x=10, y=5,z=2 then w*{(x/y)%z}=?

class java
{
	int w,x,y,z;
	float a,b;
	void set_data()
	{
		w=100;
		x=10;
		y=5;
		z=2;
		}
		void sum()
		{
			a=(x/y)*z;
			b=w*(a/100);
			}
			void display()
			{
				System.out.print("w*{(x/y)%z}= "+b);
				}
				}
				class q3
				{
				public static void main(String args[])
				{
					java obj = new java();
					obj.set_data();
					obj.sum();
					obj.display();
					}
					}
					