package September32022;

class M extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread M: "+i);
		}
	}
}
	
class N extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread N: "+i);
		}
	}	
}
	
public class ExtendingThreadClass 
	{
		public static void main(String[] args)
		{
			M m = new M();
			N n = new N();
			
			m.start();
			n.start();
		}
	}

