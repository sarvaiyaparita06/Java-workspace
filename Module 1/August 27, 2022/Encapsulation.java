package August272022;

public class Encapsulation {

	public static void main(String[] args)
	{
	
		Model m = new Model();	

		m.setName("Parita");
		m.setCity("Vadodara");
		
		System.out.println(m.getName()+" from "+m.getCity());
	}

}
