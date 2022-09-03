package August302022;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		String b = sc.next();
		
		if(b.length()>1)
		{
			System.out.println("Invalid input");
		}
		else if(b=="a" || b=="e" || b=="i"  || b=="o"  || b=="u"  || b=="A"  || b=="E"  || b=="I"  || b=="O"  || b=="U");
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is a consonant");
		}
	}

}
