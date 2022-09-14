package September132022;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample 
{
	JFrame frame;
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11;
	
	
	public GridLayoutExample() 
	{
		frame=new JFrame();
		
		bt1 =new JButton("1");
		bt2 =new JButton("2");
		bt3 =new JButton("3");
		bt4 =new JButton("4");
		bt5 =new JButton("5");
		bt6 =new JButton("6");
		bt7 =new JButton("7");
		bt8 =new JButton("8");
		bt9 =new JButton("9");
		bt10 =new JButton("10");
		bt11 =new JButton("11");
	
		frame.add(bt1);
		frame.add(bt2);
		frame.add(bt3);
		frame.add(bt4);
		frame.add(bt5);
		frame.add(bt6);
		frame.add(bt7);
		frame.add(bt8);
		frame.add(bt9);
		frame.add(bt10);
		frame.add(bt11);
		
		frame.setSize(300, 300);
		frame.setLayout(new GridLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new GridLayoutExample();
	}
}
