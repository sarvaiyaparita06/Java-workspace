package August302022;

public class StringCompareExample {

	public static void main(String[] args) 
	{
		String s1 = "Sachin";//Literal String
		String s2 = "Sachin";
		String s3 = new String("Sachin");//new keyword string
		String s4 = new String("Ratan");
		String s5 = new String("SACHIN");
	
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println(s1.equalsIgnoreCase(s5));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.compareTo(s4));
	}

}
