package September102022;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonExample 
{
	JFrame frame;
	JRadioButton rb1,rb2;
	
	public RadioButtonExample() 
	{
		frame=new JFrame();
		
		rb1=new JRadioButton("Male");
		rb1.setBounds(158, 7, 109, 23);
		
		rb2=new JRadioButton("Female");
		rb2.setBounds(158, 46, 109, 23);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		
		new RadioButtonExample();
	}
}