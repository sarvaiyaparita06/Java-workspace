package September102022;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class IconExample 
{
	public IconExample() 
	{
		Frame frame =new Frame();
		Image icon = Toolkit.getDefaultToolkit().getImage("/Users/paritasarvaiya/Downloads/icon.jpeg");    
		frame.setIconImage(icon);
		frame.setLayout(null);     
		frame.setSize(400,400);     
		frame.setVisible(true);     
	}
	public static void main(String[] args)
	{
		
		new IconExample();
		
	}
}
