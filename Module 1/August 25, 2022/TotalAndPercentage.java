package August252022;

import java.util.Scanner;

public class TotalAndPercentage {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter English subject marks: ");
			int a=sc.nextInt();
			System.out.println("Enter Math subject marks: ");
			int b=sc.nextInt();
			System.out.println("Enter Science subject marks: ");
			int c=sc.nextInt();
			System.out.println("Enter History subject marks: ");
			int d=sc.nextInt();
			System.out.println("Enter Geography subject marks: ");
			int e=sc.nextInt();
			
			int sum=a+b+c+d+e;
			float percent=sum*100/500;
			System.out.println("Your percentage is " + percent);
			
			if(percent>=75)
			{
				System.out.println(("You have distinction"));
			}
			else if(percent>60 && percent<=75)
				System.out.println("You have first class ");
			else if(percent>50 && percent<=60)
				System.out.println("You have second class ");
			else if(percent>35 && percent<=50)
				System.out.println("You have pass class ");
			
			else 
			{
				System.out.println("You have failed");
			}
		}	
			
		
	}

}
