package August252022;

public class LeapYear {

	public static void main(String[] args) 
	{
		
		int year=2004;
		
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}

}
