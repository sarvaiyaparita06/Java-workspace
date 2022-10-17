package October062022;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameExample implements ActionListener
{
	
	JFrame frame;
	JButton btninsert,btnview,btnupdate,btndelete;
	
	public FrameExample() 
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
		
		
		new FrameExample();
		
	}

	public void actionPerformed1(ActionEvent e) 
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
			a.updatedata();
		}
		if(e.getSource()==btndelete)
		{
			a.deletedata();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
class AllOperations
{
	
		JFrame insertframe,deleteframe,updateframe;
		JTextField tf1,tf2,tfid;
		JButton insertbtn,deletebtn,editbtn,updatebtn;
		JPanel jp,jp2;
		int did=0;
		
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
		
		public void updatedata()
		{
				
				updateframe = new JFrame();
				
				jp =new JPanel();
				jp2 =new JPanel();
				
				tfid =new JTextField(20);
				tf1 = new JTextField(20);
				tf2 = new JTextField(20);
				updatebtn =new JButton("Update");
				editbtn =new JButton("Edit");
				
				jp.add(tfid);
				jp.add(editbtn);
				
				jp2.add(tf1);
				jp2.add(tf2);
				jp2.add(updatebtn);
				
				jp.add(jp2);
				
				jp2.setVisible(false);
				
				
				editbtn.addActionListener(new ActionListener() 
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
							String id2 = tfid.getText().toString();
							did=Integer.parseInt(id2);
							String sql ="select * from info where id = '"+id2+"'";
							
							Statement stmt = (Statement) con.createStatement();
							
							ResultSet set = ((java.sql.Statement) stmt).executeQuery(sql);
							
							if(set.next())
							{
									int id =set.getInt(1);
									String name =set.getString(2);
									String surname =set.getString(3);
									
									tf1.setText(name);
									tf2.setText(surname);
							}
							jp2.setVisible(true);
							jp.setVisible(false);
							
							updatebtn.addActionListener(new ActionListener() 
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
										
										
										String name = tf1.getText().toString();
										String surname =tf2.getText().toString();
										
										String sql= "update info set name='" + name + "',surname='"+ surname
										+ "' where id=" + did+ "";
										
										Statement stmt =(Statement) con.createStatement();
										
										int status =((java.sql.Statement) stmt).executeUpdate(sql);
										
										if(status>0)
										{
											updateframe.setVisible(false);
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

						}
						catch (Exception e1) 
						{
							e1.printStackTrace();
						}
						
					}
				});
			
				updateframe.add(jp);
				updateframe.add(jp2);
				updateframe.setSize(500,500);
				updateframe.setLayout(new FlowLayout());
				updateframe.setVisible(true);
		
		}

}
