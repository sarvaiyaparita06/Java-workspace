package September102022;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class RegistrationForm
{
	JFrame frame;
	JPanel panel;
	JTextField tf1,tf2,tf3;	
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,jl1,jl2;
    JPasswordField pf1,pf2;
    JRadioButton rb1,rb2;
    JCheckBox chk1,chk2,chk3,chk4;
    @SuppressWarnings("rawtypes")
	JComboBox comboBox;
    JButton btn1;
	RegistrationForm() 
	{
		frame = new JFrame();
		
		l1 = new JLabel("Registration Form");
	 	l1.setForeground(Color.WHITE);
	 	l1.setFont(new Font("Verdana", Font.BOLD, 35));
		
		panel = new JPanel();
		panel.setBackground(Color.black);
		panel.setBounds(0, 11, 650, 50);
		 	
	 	l2 = new JLabel("First Name :");
		l2.setBounds(37, 106, 81, 14);
		frame.add(l2);
		 	
		l3 = new JLabel("Last Name :");
		l3.setBounds(274, 106, 70, 14);
		frame.add(l3);
			
		l4 = new JLabel("UserName :");
		l4.setBounds(37, 148, 81, 14);
		frame.add(l4);
			
		l5 = new JLabel("Password :");
		l5.setBounds(37, 183, 81, 14);
		frame.add(l5);
			
		l6 = new JLabel("ReEnter Pass :");
		l6.setBounds(24, 219, 94, 14);
		frame.add(l6);
			
		l7 = new JLabel("BirthDate :");
		l7.setBounds(37, 252, 81, 14);
		frame.add(l7);
			
		Component dateChoose = new JDateChooser();
		dateChoose.setBounds(115, 246, 137, 20);
		frame.add(dateChoose);
			
		l8 = new JLabel("Address :");
		l8.setBounds(47, 282, 70, 14);
		frame.add(l8);
			
		l9 = new JLabel("Gender :");
		l9.setBounds(65, 350, 62, 14);
		frame.add(l9);
			
		l10 = new JLabel("Course :");
		l10.setBounds(48, 379, 81, 14);
		frame.add(l10);
		
		l11 = new JLabel("City");
		l11.setBounds(293, 287, 46, 14);
		frame.add(l11);
			
		tf1 = new JTextField();
		tf1.setBounds(115, 103, 137, 20);
		frame.add(tf1);
		tf1.setColumns(10);
			
		tf2 = new JTextField();
		tf2.setBounds(354, 103, 134, 20);
		frame.add(tf2);
		tf2.setColumns(10);
			
		tf3 = new JTextField();
		tf3.setBounds(115, 145, 137, 20);
		frame.add(tf3);
		tf3.setColumns(10);
			
		pf1 = new JPasswordField();
		pf1.setBounds(115, 180, 137, 20);
		frame.add(pf1);
			
		pf2 = new JPasswordField();
		pf2.setBounds(115, 216, 137, 20);
		frame.add(pf2);
			
		JTextArea textArea = new JTextArea();
		textArea.setBounds(115, 277, 137, 56);
		frame.add(textArea);
			
		rb1 = new JRadioButton("Male");
		rb1.setBounds(114, 346, 70, 23);
		rb1.setBackground(Color.lightGray);
		frame.add(rb1);
			
		rb2 = new JRadioButton("Female");
		rb2.setBounds(194, 346, 109, 23);
		rb2.setBackground(Color.lightGray);
		frame.add(rb2);
			

		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
			
		chk1 = new JCheckBox("JAVA");
		chk1.setBounds(114, 375, 62, 23);
		chk1.setBackground(Color.lightGray);
		frame.add(chk1);
			

		chk2 = new JCheckBox("PYTHON");
		chk2.setBounds(182, 375, 80, 23);
		chk2.setBackground(Color.lightGray);
		frame.add(chk2);
			
		chk3 = new JCheckBox("PHP");
		chk3.setBounds(274, 375, 51, 23);
		chk3.setBackground(Color.lightGray);
		frame.add(chk3);
			
		chk4 = new JCheckBox("DOTNET");
		chk4.setBounds(341, 375, 97, 23);
		chk4.setBackground(Color.lightGray);
		frame.add(chk4);
			
			
		String[] msg = {"Surat","Ahemdabad","Vadodara","Rajkot"};
		comboBox = new JComboBox<>(msg);
		comboBox.setBounds(354, 284, 130, 20);
		comboBox.setSelectedIndex(2);
		frame.add(comboBox);
			
		btn1 = new JButton("Continue");
		btn1.setBounds(115, 413, 137, 23);
		btn1.setBackground(new Color(105,105,105));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
			
		frame.add(btn1);
			
		jl1 = new JLabel("Already have an account ?");
		jl1.setBounds(78, 460, 150, 14);
		frame.add(jl1);
			
		jl2 = new JLabel("LogIn");
		jl2.addMouseListener(new MouseListener() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
			}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				
			}

			@Override
			public void mouseReleased(MouseEvent e) 
			{
				
			}

			@Override
			public void mouseEntered(MouseEvent e) 
			{
				
			}

			@Override
			public void mouseExited(MouseEvent e) 
			{
				
			}
			});
			
			jl2.setForeground(Color.BLUE);
			jl2.setBounds(235, 460, 46, 14);
			frame.add(jl2);
		
			frame.getContentPane().setBackground(Color.lightGray);
		    frame.setLayout(null);
		    frame.setSize(650,650);
		    frame.setVisible(true);
		
		    frame.add(panel);
		    panel.add(l1);
		
	}
	
	public static void main(String[] args)
	{
		
		new RegistrationForm();
	}
	
}