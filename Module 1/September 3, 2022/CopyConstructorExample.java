package September32022;

public class CopyConstructorExample 
{
	int id;
	String name;
	
	public CopyConstructorExample(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public CopyConstructorExample(CopyConstructorExample c1)
	{
		id=c1.id;
		name=c1.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		CopyConstructorExample c1 = new CopyConstructorExample(101,"Tops");
		CopyConstructorExample c2 = new CopyConstructorExample(c1);
		
		c1.display();
		c2.display();
	}

}
