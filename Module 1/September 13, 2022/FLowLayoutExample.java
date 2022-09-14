package September132022;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FLowLayoutExample 
{
	
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public FLowLayoutExample() 
	{
		frame = new JFrame("FlowLayout");
		
		btn1 = new JButton("Insert");
		btn2 = new JButton("VIEW");
		btn3 = new JButton("Update");
		btn4 = new JButton("Delete");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(100,500);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new FLowLayoutExample();
	}
}