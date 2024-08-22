
//5) Write a program to calculate the factorial of a number ( the number can be taken as
//command line argument

class session3_q5
{
    public static void main(String []args)
	{
	  int  n,f=1,i;
	  n=Integer.parseInt(args[0]);
	  for(i=1;i<=n;i++)
	  {
		  f=f*i;
	  }
	  System.out.println("Factorial="+f);
    }	  
}