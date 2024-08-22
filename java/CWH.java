import java.util.Scanner;
class cwh
{
		int java,math,os;
		float avg;
		void get_data()
		{
		Scanner sc = new Scanner(System.in);
		java=sc.nextInt();
		Scanner sc = new Scanner(System.in);
		os=sc.nextInt();
		Scanner sc = new Scanner(System.in);
		math=sc.nextInt();
		
		float avg =(java+os+math)/3.0f;
		if(avg>40 && java>33 && math>33 && os>33){
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

class CWH{
	public static void main(String args[])
	{
		cwh obj = new cwh();
		obj.get_data();
	}
}