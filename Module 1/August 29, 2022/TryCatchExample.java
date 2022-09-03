package August302022;

public class TryCatchExample {

	public static void main(String[] args) 
	{
		try 
		{
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Success");
		}
		
	}
	
}
