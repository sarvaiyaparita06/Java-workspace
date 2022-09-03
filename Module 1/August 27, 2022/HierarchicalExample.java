package August272022;

class Bank
{
	void bank()
	{
		System.out.println("Banking");
	}
}

class Current extends Bank
{
	void current()
	{
		System.out.println("Current");
	}
}

class Savings extends Bank
{
	void savings()
	{
		System.out.println("Savings");
	}
}

public class HierarchicalExample
{
	public static void main(String[] args)
	{
		Current c = new Current();
		Savings s = new Savings();	
		
		s.bank();
		c.current();
		s.savings();
		
	}
}