package August302022;

public class OverloadingExample 
{
	static int cal(int a,int b)
	{
	
		return a+b;
	}
	
	static int cal(int a,int b,int c)
	{
		
		return a*b*c;
	}
	
	public static void main(String[] args)
	{
		System.out.println(cal(5,6));
		System.out.println(cal(2,3,4));
	}
}
	
