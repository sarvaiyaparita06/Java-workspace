
public class VoteExample {

	public static void main(String[] args)
	{
	
		int age=65;
		
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
			
			if(age>=60)
			{
				System.out.println("You are senior citizen");
			}
			else
			{
				System.out.println("You are a young person");
			}
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}

	}

}
