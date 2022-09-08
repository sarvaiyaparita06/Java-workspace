package September32022;

public class OneThread implements Runnable 
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println ("Runnable thread -"+ i);
		}
	}

	public static void main(String[] args) 
	{
		OneThread thread1 = new OneThread();
		new Thread(thread1).start();
		for (int i = 1; i <= 100; i++) 
		{
			System.out.println ("Main thread -" + + i);
		}
	}
}