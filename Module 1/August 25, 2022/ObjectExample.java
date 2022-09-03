package August252022;

public class ObjectExample {

	int id;
	String name;
	
	public static void main(String[] args) 
	{

		ObjectExample s1 = new ObjectExample();
		ObjectExample s2 = new ObjectExample();
		
		s1.id=101;
		s1.name="Parita";
		
		s2.id=102;
		s2.name="Harsh";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}

}
