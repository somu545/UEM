/*session 3
1) Write a program to display numbers from 1 to 50 using for, while and do -while loop.
*/

class Use_For_Loop
{
	public static void main(String args[])
	{
		int i,w=1,d=1;
		System.out.println("output in  for loop");
		for(i=1;i<=50;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("output in  while loop");
		while(w<=50)
		{
			System.out.println(w);
			w++;
		
		}
		
		System.out.println("output in  Do while loop");
		do
		{
			System.out.println(d);
			d++;
		}while(d<=50);
	}
}