package August302022;

public class DisplayPattern1 
{
	public static void main(String[] args) {
		int a,b,num;
		for(a=1;a<=5;a++) 
		{
			num=1;
			for(b=1;b<=a;b++) 
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}
}
