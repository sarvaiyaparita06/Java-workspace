package August252022;

public class LargestNumber {

	public static void main(String[] args) 
	{

		int a=44;
		int b=9;
		int c=29;
		
		if((a>b) && (a>c))
		{
			System.out.println(a + " is the largest number");
		
			if ((b>a) && (b>c))
			System.out.println(b + " is the largest number");
		}
		else 
			System.out.println(c +" is the largest number");
	}

}
