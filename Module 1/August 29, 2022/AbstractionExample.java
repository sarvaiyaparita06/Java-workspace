package August302022;

abstract class Tops
{
	abstract void a();
	
	void b()
	{
		System.out.println("B accessed");
	}
}

class Tops2 extends Tops
{

	@Override
	void a() 
	{
	System.out.println("A accessed");	
	}
	
}

public class AbstractionExample 
{
	public static void main(String[] args) 
	{
		
		Tops2 t = new Tops2();
		
		t.a();
		t.b();
		
	}

}
