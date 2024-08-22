import java.util.Scanner;
import java.util.Random;

class game
{
	int userInput,computerInput;
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
		// 0 for Rock, 1 for Paper, 2 for Scissor
		
		System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor -> ");
		userInput = sc.nextInt();
		
		Random random = new Random();
		computerInput = random.nextInt(3);
		
		if(userInput == computerInput){
		System.out.println(" Draw !!");
		}
		else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
		System.out.println(" You Win !");
		}
		else
		{
		System.out.println("Computer Win !");
		}
		System.out.println("Computer choice -> " +computerInput);
	}
}

class Rock_Paper_Sci
{
	public static void main(String args[])
	{
		game obj = new game();
		obj.get_input();
	}
}
