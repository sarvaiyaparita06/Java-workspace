package September032022;

public class ArrayExample4 {

	public static void main(String[] args) 
	{
		int A[]= {1,2,3,4,5};
		int B[]= new int[10];
		
		System.arraycopy(A, 1, B, 2, 3);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(B[i]);
		}
	}

}
