package September102022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationFormLogin 
{
	JFrame frame;
	JButton btn;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	
	
	public RegistrationFormLogin() 
	{
frame = new JFrame("Login");
		
		btn =new JButton("Submit");
		btn.setBounds(100, 100, 100, 20);
		
		t1 =new JTextField();
		t1.setBounds(161, 38, 86, 20);
		
		t2=new JPasswordField();
		t2.setBounds(161, 66, 86, 20);
		
		l1 =new JLabel("Username:");
		l1.setBounds(55, 41, 146, 14);
		
		l2=new JLabel("Password:");
		l2.setBounds(55, 69, 146, 14);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(btn);
		frame.add(t1);
		frame.add(t2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		btn.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) 
			{				
					String number = t1.getText().toString();
					String pass=  t2.getText().toString();
						
					if(number.equals("6304923260") && pass.equals("1234"))
					{
						new RegistrationForm();
					}
					else
					{
						System.out.println("Your Credentials are wrong");
					}
			}
		});
		
	}
	
	public static void main(String[] args) 
	{
		new RegistrationFormLogin();
	}
}

