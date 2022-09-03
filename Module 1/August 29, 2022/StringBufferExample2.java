package August302022;

public class StringBufferExample2 {

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Hello");
		s1.insert(1,"Java");
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer("Hello");
		s2.replace(1,3,"Java");
		System.out.println(s2);
		StringBuffer s3 = new StringBuffer("Hello");
		s3.delete(1,3);
		System.out.println(s3);
		StringBuffer s4 = new StringBuffer("Hello");
		s4.reverse();
		System.out.println(s4);
	}

}
