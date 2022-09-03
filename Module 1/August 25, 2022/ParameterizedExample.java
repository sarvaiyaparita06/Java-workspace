package August252022;

public class ParameterizedExample {

	int id;
	String name;	
	
	ParameterizedExample(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		ParameterizedExample p1=new ParameterizedExample(101, "Parita");
		ParameterizedExample p2=new ParameterizedExample(102, "Harsh");
		
		p1.display();
		p2.display();
		
	}

}
