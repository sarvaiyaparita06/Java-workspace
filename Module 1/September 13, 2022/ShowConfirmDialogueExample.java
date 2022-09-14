package September132022;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowConfirmDialogueExample extends WindowAdapter
{
	JFrame frame;
	
	public ShowConfirmDialogueExample() 
	{
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.addWindowListener(this);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		int ans = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
			
		if(ans==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) 
	{
		new ShowConfirmDialogueExample();
	}
}
