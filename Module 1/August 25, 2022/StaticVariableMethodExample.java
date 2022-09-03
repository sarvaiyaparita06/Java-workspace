package August252022;

public class StaticVariableMethodExample {

	int id;
	String name;
	static String college="UIC";
	
	public StaticVariableMethodExample(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	static void change()
	{
		college="UTA";
	}
	
	public static void main(String[] args) 
	{
			
		change();
		
		StaticVariableMethodExample s1=new StaticVariableMethodExample(101, "Parita");
		StaticVariableMethodExample s2=new StaticVariableMethodExample(102, "Harsh");
		
		s1.display();
		s2.display();
		
	}

}
