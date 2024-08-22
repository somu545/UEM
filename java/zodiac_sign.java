//3)	Accept your date of birth and find out your Zodiac sign (Use switch-case).

import java.util.Scanner;
public class zodiac_sign
{
    public static void main(String args[]) 
	{
        int date, month, year, num = 0;
        Scanner dm = new Scanner(System.in);
        System.out.print("\nEnter your Date : ");
        date = dm.nextInt();
        System.out.print("Enter your Month : ");
        month = dm.nextInt();
		System.out.print("Enter your Year : ");
        year = dm.nextInt();
		System.out.print("\nYour Date of Birth is : "+date+"."+month+"."+year+"\n");
		
		if((date>21 && month == 12) || (date<=19 && month== 1))
		{
			num = 1;
		}
		else if((date>20 && month ==1) || (date<=18 && month == 2))
		{
			num = 2;
		}
		else if((date>19 && month == 2) || (date<=20 && month == 3))
		{
			num = 3;
		}
		else if((date>21 && month == 3) || (date<=20 && month == 4))
		{
			num = 4;
		}
		else if((date>21 && month == 4) || (date<=20 && month == 5))
		{
			num = 5;
		}
		else if((date>21 && month == 5) || (date<=20 && month == 6))
		{
			num = 6;
		}
		else if((date>21 && month == 6) || (date<=20 && month == 7))
		{
			num = 7;
		}
		else if((date>21 && month  == 7) || (date<=20 && month== 8))
		{
			num = 8;
		}
		else if((date>21 && month ==8) || (date<=22 && month == 9))
		{
			num = 9;
		}
		else if((date>23 && month == 9) || (date<=20 && month ==10))
		{
			num = 10;
		}
		else if((date>21 && month == 10) || (date<=22 && month == 11))
		{
			num = 11;
		}
		else 
		{
			num = 12;
		}
		switch(num)
		{
			case 1: 
				System.out.println("Your Zodiac Sign is : Capricorn");
				break;
			case 2: 
				System.out.println("Your Zodiac Sign is : Aquarius");
				break;
			case 3: 
				System.out.println("Your Zodiac Sign is : Pisces");
				break;
			case 4: 
				System.out.println("Your Zodiac Sign is : Aries");
				break;
			case 5: 
				System.out.println("Your Zodiac Sign is : Taurus");
				break;
			case 6: 
				System.out.println("Your Zodiac Sign is : Gemini");
				break;
			case 7: 
				System.out.println("Your Zodiac Sign is : Cancer");
				break;
			case 8: 
				System.out.println("Your Zodiac Sign is : Leo");
				break;
			case 9: 
				System.out.println("Your Zodiac Sign is : Virgo");
				break;
			case 10: 
				System.out.println("Your Zodiac Sign is : Libra");
				break;
			case 11: 
				System.out.println("Your Zodiac Sign is : Scorpio");
				break;
			case 12: 
				System.out.println("Your Zodiac Sign is : Sagitarius");
				break;
			default:
				System.out.println("Your Zodiac Sign Invalid");
		}
	}
}