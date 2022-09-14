package September032022;

class Sender
{
	public void send(String msg)
	{
		System.out.println(msg);
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}

class Threadsend extends Thread
{
	String msg;
	Sender sender;
	
	public Threadsend(String msg,Sender sender)
	{
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run()
	{
		synchronized (sender)
		{
			sender.send(msg);
		}
	}
}

public class SleepTime 
{
	public static void main(String[] args)
	{
		Sender sender = new Sender();
		Threadsend t1 = new Threadsend("Welcome", sender);
		Threadsend t2 = new Threadsend("GoodBye", sender);
		
		t1.start();
		t2.start();
	}
}
