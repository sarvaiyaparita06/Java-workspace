package September132022;

import javax.swing.JOptionPane;

public class ShowInputDialogueExample 
{
	public static void main(String[] args) 
	{
		
		String name = JOptionPane.showInputDialog("Enter your Name");
	
		System.out.println("Welcome "+name);
	}
}