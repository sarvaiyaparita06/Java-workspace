package September012022;

@SuppressWarnings("serial")
public class MyException extends Exception
{
	public MyException()
	{
		System.out.println("After Error code is executed");
	}
	
	public static void main(String[] args)
	{
		
		@SuppressWarnings("unused")
		MyException m1 =new MyException();
		
		
	}

}