package September092022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CafeorderingSystemExample implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton order;
	
	public CafeorderingSystemExample() 
	{
		frame=new JFrame("Cafe Ordering System");
		
		chk1=new JCheckBox("Pizaa @ rs.120");
		chk1.setBounds(178, 25, 130, 23);
		
		chk2=new JCheckBox("Burger @ rs.50");
		chk2.setBounds(178, 65, 130, 23);
		
		chk3=new JCheckBox("Coffee @ rs.70");
		chk3.setBounds(178, 105, 130, 23);
	
		order=new JButton("ORDER");
		order.setBounds(178, 145, 117, 23);
		
		order.addActionListener(this);
		
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(order);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		
		
		new CafeorderingSystemExample();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==order)
		{
			int amount=0;
			StringBuilder builder = new StringBuilder();
			builder.append("\n Selected Items \n");
			
			if(chk1.isSelected())
			{
				builder.append("\n Pizza @ rs.120 \n");
				amount+=120;
			}
			if(chk2.isSelected())
			{
				builder.append("\n Burger @ rs.50\n");
				amount+=50;
			}
			if(chk3.isSelected())
			{
				builder.append("\n Coffee @ rs.70 \n");
				amount+=70;
			}
			
			builder.append("\n Total :"+amount);
			JOptionPane.showMessageDialog(frame, builder.toString());
		}
	}
}
