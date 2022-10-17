package October042022;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame implements ActionListener
	{
		
		JFrame frame;
		JButton btninsert,btnview,btnupdate,btndelete;
		
		public Frame() 
		{
			frame = new JFrame();
			
			btninsert = new JButton("INSERT");
			btnview = new JButton("VIEW");
			btnupdate = new JButton("UPDATE");
			btndelete = new JButton("DELETE");
			
			btninsert.addActionListener(this);
			btnview.addActionListener(this);
			btnupdate.addActionListener(this);
			btndelete.addActionListener(this);
			
			frame.add(btninsert);
			frame.add(btnview);
			frame.add(btnupdate);
			frame.add(btndelete);
			
			frame.setSize(500,500);
			frame.setLayout(new FlowLayout());
			frame.setVisible(true);
		
		}
		
		public static void main(String[] args) 
		{
			
			
			new Frame();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			AllOperations a =new AllOperations();
			
			if(e.getSource()==btninsert)
			{
				a.insertdata();
			}
			if(e.getSource()==btnview)
			{
				a.viewdata();
			}
			if(e.getSource()==btnupdate)
			{
				
			}
			if(e.getSource()==btndelete)
			{
				a.deletedata();
			}
		}

		public void actionPerformed1(ActionEvent e) 
		{
			
		}
	}
	class AllOperations
	{
		
			JFrame insertframe,deleteframe;
			JTextField tf1,tf2,tfid;
			JButton insertbtn,deletebtn;
			
			
			public void insertdata()
			{
				
					insertframe = new JFrame();
					
					tf1 = new JTextField(20);
					tf2 = new JTextField(20);
					insertbtn = new JButton("INSERT DATA");
					
					insertbtn.addActionListener(new ActionListener() 
					{
						
						@Override
						public void actionPerformed(ActionEvent e) 
						{
					
							//Database Connectivity Authentication
							String host="jdbc:mysql://localhost:3306/";
							String db="information";
							String url =host+db;
						
							
							try 
							{
								Connection con = DriverManager.getConnection(url,"root","");
								
								String name =tf1.getText().toString();
								String surname =tf2.getText().toString();
								
								String sql ="insert into info values(null,'"+name+"','"+surname+"')";
								
								Statement stmt =(Statement) con.createStatement();
								
								int status = ((java.sql.Statement) stmt).executeUpdate(sql);
								
								if(status>0)
								{
									
									insertframe.setVisible(false);
								}
								else
								{
									System.out.println("Error");
									
								}
								
								
								
								
							}
							catch (Exception e1) 
							{
								e1.printStackTrace();
							}
							
							
							
							
							
							
							
						}
					});
					
					
					insertframe.add(tf1);
					insertframe.add(tf2);
					insertframe.add(insertbtn);
					
					insertframe.setSize(500,500);
					insertframe.setLayout(new FlowLayout());
					insertframe.setVisible(true);
					
				
			}
			
			public void viewdata()
			{
				
				String host="jdbc:mysql://localhost:3306/";
				String db="information";
				String url =host+db;
				
				try 
				{
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql ="select * from info";
					
					Statement stmt =(Statement) con.createStatement();
					
					ResultSet set = ((java.sql.Statement) stmt).executeQuery(sql);
					
					System.out.println("ID"+" "+"NAME"+" "+"SURNAME");
					
					while(set.next())
					{
						int id = set.getInt(1);
						String name =set.getString(2);
						String surname =set.getString(3);
						
						
						System.out.println(id+" "+name+" "+surname);
					}
					
					
					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				
				
			}
			
			public void deletedata()
			{
				
				
				deleteframe = new JFrame();
				tfid = new JTextField(20);
				deletebtn =new JButton("DELETE");
				
				
				
				deleteframe.add(tfid);
				deleteframe.add(deletebtn);
				
				deleteframe.setSize(500,500);
				deleteframe.setLayout(new FlowLayout());
				deleteframe.setVisible(true);
				
				
				deletebtn.addActionListener(new ActionListener() 
				{
					
					@Override
					public void actionPerformed(ActionEvent e) 
					{
												
						String host="jdbc:mysql://localhost:3306/";
						String db="information";
						String url =host+db;
						
						try 
						{
							Connection con = DriverManager.getConnection(url,"root","");
							
							String id1 = tfid.getText().toString();
							
							//int id2 =Integer.parseInt(id1);
							
							String sql = "delete from info where id = '"+id1+"'";
							
							Statement stmt = (Statement) con.createStatement();
							
							int status = ((java.sql.Statement) stmt).executeUpdate(sql);
							
							if(status > 0)
							{
								deleteframe.setVisible(false);
							}
							else
							{
								System.out.println("Error");
							}
						} 
						catch (Exception e2)
						{
							e2.printStackTrace();
						}
						
					}
				});
				
				
			}
			
		
}

