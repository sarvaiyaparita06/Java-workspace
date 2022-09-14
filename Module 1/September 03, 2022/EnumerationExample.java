package September032022;

enum Student1
{
	John(11), Bella(15), Sam(17), Viraaj(13);
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	private Student1(int age) 
	{
		this.age= age;
	}
	
	
	
}

public class EnumerationExample 
{
	public static void main(String[] args) 
	{
		
			System.out.println(Student1.Bella.getAge());
		
	}
}
