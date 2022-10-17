package September272022;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add("Android");
		list.add("Java");
		list.add("Php");
		list.add("Ios");
		
		ArrayList<Object> list2 = new ArrayList<>();
		
		list2.add("Flutter");
		list2.add("React");
		list2.add("Java");
		
		list.retainAll(list2);
		
		System.out.println(list);
		
		Iterator<Object> i =list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
