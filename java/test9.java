//Take a word (say “Kolkata”) as a command line argument and display it as “Hello
//Kolkata”.

class q6
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Total Word"+args.length);
		//system.out.println(args[0]+" "+args[1]);
		for(i=0;i<args.length;i++)
		{
			System.out.print(args[i]);
			System.out.print(" ");
		}
	}
}