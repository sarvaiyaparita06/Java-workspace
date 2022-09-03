package August252022;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) 
	{
		System.out.println("Enter your choice: ");
		try (Scanner sc = new Scanner(System.in))
		{
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println("Enter the value of base: ");
				Scanner t = new Scanner(System.in);
				int b=t.nextInt();
				System.out.println("Enter the value of height: ");
				int h=t.nextInt();
				
				double a=(b*h)/2;
				
				System.out.println("Area of Triangle is "+ a);
				break;
			case 2:
				System.out.println("Enter the value of width: ");
				Scanner r = new Scanner(System.in);
				int w=r.nextInt();
				System.out.println("Enter the value of length: ");
				int l=r.nextInt();
				
				double c=w*l;
				
				System.out.println("Area of Rectangle is "+ c);
				break;
			case 3: 
				System.out.println("Enter the value of radius: ");
				Scanner c1 = new Scanner(System.in);
				int e=c1.nextInt();
				double d=(3.14*e*e);
				
				System.out.println("Area of circle is "+ d);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
