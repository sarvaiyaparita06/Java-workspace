package September092022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculationExample2 implements ActionListener
{
	
	JFrame frame;
	
	JTextField tf1,tf2,tf3;
	
	JButton btn1,btn2;
	
	
	public CalculationExample2() 
	{	
		frame=new JFrame();
		
		tf1=new JTextField();
		tf1.setBounds(175, 11, 86, 20);
		
		tf2 =new JTextField();
		tf2.setBounds(175, 41, 86, 20);
		
		tf3 =new JTextField();
		tf3.setBounds(175, 71, 86, 20);
		tf3.setEditable(false);
		
		btn1=new JButton("+");
		btn1.setBounds(155, 123, 53, 29);
		
		btn2=new JButton("-");
		btn2.setBounds(228, 123, 53, 29);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CalculationExample2();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{		
		String num1 =tf1.getText().toString();
		String num2 =tf2.getText().toString();
		int c=0;
		if(e.getSource()==btn1)
		{
			c=Integer.parseInt(num1)+Integer.parseInt(num2);
		}
		if(e.getSource()==btn2)
		{
			c=Integer.parseInt(num1)-Integer.parseInt(num2);
		}

			tf3.setText(String.valueOf(c));
	}
}
