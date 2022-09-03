package August272022;

interface Print
{
	void print();
	
	
}
interface Show
{
	void show();
}

public class MultipleExample implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}
	
	public static void main(String[] args) {
		
		MultipleExample m1 =new MultipleExample();
		
		m1.print();
		m1.show();
		
	}

}