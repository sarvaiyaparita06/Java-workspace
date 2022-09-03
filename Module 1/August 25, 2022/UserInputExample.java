package August252022;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) 
	{

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your id: ");
			sc.nextInt();
			
			System.out.println("Enter your name: ");
			sc.next();
			
			System.out.println("Enter your salary: ");
			double salary=sc.nextDouble();
			
			if(salary>30000)
			{
				System.out.println("It's good");
			}
			else
			{
				System.out.println("It's not good");
			}
		}
	}

}
