package August302022;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) 
	{
		int i,	n, sum = 0;
		double average;
		
		System.out.println("Enter any five numbers");
		
		for(i=0;i<5;i++)
		{
			try (Scanner sc = new Scanner(System.in)) {
				n=sc.nextInt();
			}
			sum+=n;
		}
		
		average = sum/5;
		System.out.println("The sum of the numbers is: "+sum+"\n The average of the numbers is: "+average);
	}

}
