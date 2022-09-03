package August252022;

public class StaticExample {

	static int count=0;
	
	public StaticExample()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		new StaticExample();
		new StaticExample();
		new StaticExample();
	}

}
