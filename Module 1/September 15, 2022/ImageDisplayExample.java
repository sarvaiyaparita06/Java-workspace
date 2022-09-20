package September152022;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ImageDisplayExample extends Canvas
{
	@Override
	public void paint(Graphics g) 
	{
			// TODO Auto-generated method stub
			
			  Toolkit t=Toolkit.getDefaultToolkit();  
		      Image i=t.getImage("E://a.png");  
		      g.drawImage(i, 120,100,this);  
		      
	}
	public static void main(String[] args) 
	{
		ImageDisplayExample m=new ImageDisplayExample();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
	}
}