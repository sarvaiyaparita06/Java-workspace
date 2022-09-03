package August272022;

	class P
	{
		void p()
		{
			System.out.println("P executed");
		}
	}
	
	class Q extends P
	{
		void q()
		{
			System.out.println("Q executed");
		}
	}

	class R extends Q
	{
		void r()
		{
			System.out.println("R executed");
		}
	}
	
public class MultilevelExample 
{
	public static void main(String[] args) 
	{

		R r = new R();
		
		r.p();
		r.q();
		r.r();
		
	}

}
