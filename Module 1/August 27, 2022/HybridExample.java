package August272022;

class M
{
	void m()
	{
		System.out.println("M executed");
	}
}

class N extends M
{
	void n()
	{
		System.out.println("N executed");
	}
}

interface S
{
	void s();
}

class Y extends N implements S
{
	void y()
	{
		System.out.println("Y executed");
	}
	
	public void s()
	{
		System.out.println("S executed");
	}
}

public class HybridExample 
{

	public static void main(String[] args)
	{
		Y y = new Y();
		
		y.m();
		y.n();
		y.s();
		y.y();
		
	}
	
}
