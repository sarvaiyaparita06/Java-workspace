package August302022;

import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number less then ten billion: ");
		try (Scanner sc = new Scanner(System.in)) {
			long n=sc.nextLong();
			
			if(n<0) 
			{
				n *=-1;
			}
				if(n>=1000000000L) {
					System.out.println("Number is greater then or equal to 10,000,000,000!");
				}
				else {
					int digits=1;
					if(n>=10 && n<=100) {
						digits=2;
					}
					else if(n>=100 && n<=1000) {
						digits=3;
					}
					else if(n>=1000 && n<=10000) {
						digits=4;
					}
					else if(n>=10000 && n<=100000) {
						digits=5;
					}
					else if(n>=100000 && n<=1000000) {
						digits=6;
					}
					else if(n>=1000000 && n<=10000000) {
						digits=7;
					}
					else if(n>=10000000 && n<=100000000) {
						digits=8;
					}
					else if(n>=100000000 && n<=1000000000) {
						digits=9;	
					}
					else if(n>=1000000000 && n<=1000000000L) {
						digits=10;
					}
					System.out.println("The number of digits in the number: "+digits);
					}
		}
			}
		 
		{
			System.out.println("The number is not an integer");
		}
	}




