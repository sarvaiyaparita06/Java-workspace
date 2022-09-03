package August272022;

class Color1
{
	String color="Black";
}
class Color2 extends Color1
{
	String color="White";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperExample 
{
	public static void main(String[] args) {
		
		Color2 c =new Color2();
		c.display();
		
	}
}