package August252022;

import java.util.Scanner;

public class OperatorsUsingSwitch {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("Invalid option");
				break;
			
			}
		}
		
	}

}
