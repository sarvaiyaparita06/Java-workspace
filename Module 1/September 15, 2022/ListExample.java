package September152022;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListExample 
{
	JFrame frame;
	JList<String> list;
	
	
	public ListExample()
	{
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		
		DefaultListModel<String>m =new DefaultListModel<>();
		m.addElement("Java");
		m.addElement("Android");
		m.addElement("Flutter");
		
		list=new JList<>(m);
		list.setBounds(100,100, 75,75); 
		
		frame.add(list);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new ListExample();
	}
}
