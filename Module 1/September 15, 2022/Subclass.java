package September152022;

class ParentClass
{
	public void parentMethod()
	{
    System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass
{
	public void childMethod()
	{
        System.out.println("This is child class");
    }
}

public class Subclass 
{
public static void main(String[] args) {
	    
		ParentClass pObject = new ParentClass();

		ChildClass cObject = new ChildClass();
		
		pObject.parentMethod();

		cObject.childMethod();

		cObject.parentMethod();
	}
}
