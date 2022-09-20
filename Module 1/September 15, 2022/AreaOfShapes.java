package September152022;

public class AreaOfShapes 
{
	void Area ( float l , float b) 
	{
		System.out.println("The area of the rectangle is "+ (l*b)+ "sq units");
	}

	void Area (float s) 
	{
		System.out.println("The area of the square is "+Math.pow(s, 2)+" sq units");
	}
	
	public static void main(String[] args) 
	{
		AreaOfShapes a1 = new AreaOfShapes();
		
		a1.Area(6);
		
		a1.Area(10 , 11);
		
	}
}
