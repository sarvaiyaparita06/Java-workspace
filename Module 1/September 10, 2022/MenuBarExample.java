package September102022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuBarExample implements ActionListener
{
	JFrame frame;
	JMenuBar menuBar;
	JMenu file,edit,help;
	JMenuItem i1,i2,i3,i4,i5;
	JTextArea ta;
	
	public MenuBarExample()
	{
		frame = new JFrame();
		
		menuBar = new JMenuBar();
		
		ta=new JTextArea();
		ta.setBounds(71, 47, 261, 140);
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
	
		i1=new JMenuItem("Cut");
		i2=new JMenuItem("Copy");
		i3=new JMenuItem("Paste");
		i4=new JMenuItem("Select All");
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		
		edit.add(i1);
		edit.add(i2);
		edit.add(i3);
		edit.add(i4);
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		frame.add(ta);
		frame.setSize(500,500);
		frame.setJMenuBar(menuBar);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MenuBarExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==i1)
		{
			ta.cut();
		}
		if(e.getSource()==i2)
		{
			ta.copy();
		}
		if(e.getSource()==i3)
		{
			ta.paste();
		}
		if(e.getSource()==i4)
		{
			ta.selectAll();
		}
	}
}
