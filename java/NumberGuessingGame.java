import java.util.Scanner;
import java.util.Random;

 class game
 {
	int computerInput,userInput,attempt;
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
		Random obj = new Random();
		computerInput = obj.nextInt(50);
		System.out.println("To quit the game enter negative value or value greater than Range");
		do
		{
			System.out.print("Enter a Number between ( 1 - 50): ");
			userInput = sc.nextInt();
			
			if(userInput == computerInput)
			{
				System.out.println("You guess is correct");
			}
			else if(userInput > computerInput)
			{
				System.out.println("Your guess is greater than computer input");
			}
			else if(userInput < computerInput)
			{
				System.out.println("Your guess is smaller than computer input");
			}
			if(attempt == 10)
			{
				System.out.println("you have exceeded the maximum attempt");
				break;
			}
			attempt++;
			if(userInput > 50 || userInput < 0)
			{
				System.out.println("you have chosen to quit");
				break;
			}
		}while( userInput != computerInput);
	}
}

class NumberGuessingGame 
{
	public static void main(String args[])
	{
		game obj = new game();
		obj.get_input();
	}
}
		
	