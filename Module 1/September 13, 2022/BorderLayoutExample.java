package September132022;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample 
{
	
	JFrame frame;
	JButton b1,b2,b3,b4,b5;
	
	
	public BorderLayoutExample() 
	{
		frame = new JFrame();
	
		b1 = new JButton("EAST");
		b2 = new JButton("WEST");
		b3 = new JButton("NORTH");
		b4 = new JButton("SOUTH");
		b5 = new JButton("CENTER");
		
		frame.add(b1,BorderLayout.EAST);
		frame.add(b2,BorderLayout.WEST);
		frame.add(b3,BorderLayout.NORTH);
		frame.add(b4,BorderLayout.SOUTH);
		frame.add(b5,BorderLayout.CENTER);
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new BorderLayoutExample();
	}
}
