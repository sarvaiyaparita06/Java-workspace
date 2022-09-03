package August272022;



class A
{
	void a1()
	{
		System.out.println("A1 executed");
	}
}

class B extends A
{
	void b1()
	{
		System.out.println("B1 executed");
	}
}
	
public class SingleExample 
{
	
	public static void main(String[] args) 
	{
	
		B b = new B();
		
		b.a1();
		b.b1();
	}
	

}
