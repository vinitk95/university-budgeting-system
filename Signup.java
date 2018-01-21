package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.text.PasswordView;

import org.jfree.ui.RefineryUtilities;

//import bean.Student;
import beans.ManagementStaff;
import dao.ManagementDaoImp;
import beans.UniversityStaff;
import dao.UniversityStaffDaoImp;

public class Signup extends JFrame implements ActionListener
{
JTextField tf1,tf2,tf5;
JPasswordField  tf3,tf4;
JComboBox jc;
JButton b1,b2,b3,b4;
JRadioButton r1,r2;
ButtonGroup bg;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,label,image;

Font h=new Font("Arial",Font.BOLD,40);

Font f=new Font("Arial",Font.BOLD,20);
ManagementDaoImp mdi;
UniversityStaffDaoImp udi;
Signup()
	{

	tf1= new JTextField();		
tf1.setBounds(320, 140, 200, 30);
tf2= new JTextField();	
tf2.setBounds(320, 180, 200, 30);


tf5= new JTextField();		
tf5.setBounds(320, 260, 200, 30);



tf3= new JPasswordField();
tf3.setBounds(320, 360, 200, 30);
tf4= new JPasswordField();		
tf4.setBounds(320, 400, 200, 30);
b1= new JButton("SUBMIT");
b1.setBounds(60, 500, 150, 30);
b2= new JButton("RESET");
b2.setBounds(310,  500, 150, 30);
b3= new JButton("BACK");
b3.setBounds(550,  500, 150, 30);
b4=new JButton();

l1= new JLabel("Enter user name: ");	
l1.setFont(f);
l1.setForeground(Color.red);
l1.setBounds(100, 100, 200, 20);
l2= new JLabel("First Name");
l2.setBounds(100, 140, 200, 20);
l2.setForeground(Color.orange);
l3= new JLabel("Last Name");
l3.setBounds(100, 180, 100, 20);
l3.setForeground(Color.orange);
l4= new JLabel("Enter Password:");
l4.setFont(f);
l4.setForeground(Color.red);
l4.setBounds(100, 320, 200, 20);
l4.setForeground(Color.red);
l5= new JLabel("Password");
l5.setBounds(100, 360, 100, 20);
l5.setForeground(Color.orange);
l6= new JLabel("Confirm password");
l6.setBounds(100, 400, 200, 20);
l6.setForeground(Color.orange);
label = new JLabel("SIGN UP");
label.setBounds(300, 30, 500, 40);
label.setForeground(Color.BLUE);
label.setFont(h);

l7= new JLabel("Enter Email Id: ");	
l7.setFont(f);
l7.setForeground(Color.red);
l7.setBounds(100, 220, 150, 20);
l8= new JLabel("Emai Id");
l8.setBounds(100, 260, 70, 20);
l8.setForeground(Color.orange);
l8.setFont(f);
r1=	new JRadioButton(" MANAGEMENT STAFF"); 
r1.setBounds(100, 440, 300, 20);
r1.setOpaque(false);
r2=new JRadioButton("UNIVERSITY STAFF");   
r2.setBounds(450, 440, 300,20);
r2.setOpaque(false);
 bg=new ButtonGroup();    

setSize(800,600);
//setResizable(false);
//getContentPane().setBackground(Color.DARK_GRAY);
mdi=new ManagementDaoImp();
udi=new UniversityStaffDaoImp();
l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f);
l5.setFont(f);
l6.setFont(f);
l7.setFont(f);
tf1.setFont(f);
tf2.setFont(f);
tf3.setFont(f);
tf4.setFont(f);
tf5.setFont(f);
b1.setFont(f);
b2.setFont(f);
b3.setFont(f);
r2.setFont(f);
r1.setFont(f);

bg.add(r1);
bg.add(r2);    
add(r1);
add(r2);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(tf5);
add(b1);	
add(b2);
add(b3);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(b1);
add(b2);
add(b3);
add(label);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
image = new JLabel(new ImageIcon("Images/back.jpg"));
image.setBounds(0,0,800,600);
add(image);
setLayout(null);
RefineryUtilities.centerFrameOnScreen(this);
setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1 && r1.isSelected())
		{
			String s1=tf1.getText();
			String s2=tf2.getText();
			
			String s3=tf3.getText();
			String s4=tf4.getText();
			
			 String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
			 String s5=tf5.getText();
		      Boolean b = s5.matches(EMAIL_REGEX);
		      if(b==true)
		      {
			
			if(s3.equals(s4))
			{
				ManagementStaff ms=new ManagementStaff();
				
				ms.setFirstn(s1);
				ms.setLastn(s2);
				ms.setEmailid(s5);
				ms.setPassword(s4);
				
				try
				{
					int rowAffected=mdi.addManagementStaff(ms);
					if(rowAffected==1)
					{
						JOptionPane.showMessageDialog(null,"THANKYOU FOR SIGNUP");
						this.setVisible(false);
						Home h=new Home();
					
					}
					else
						JOptionPane.showMessageDialog(null,"Error in insertion");
				}
				catch(Exception ea)
				{
					JOptionPane.showMessageDialog(null,ea);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "password and confirm password should be equal");
			}
		      }
		      else
		      {
		    	  JOptionPane.showMessageDialog(this, "ENTER A VALID EMAIL ID");
		      }
			
		}
		
		else
			
		if(e.getSource()==b1 && r2.isSelected())
		{
			String s1=tf1.getText();
			String s2=tf2.getText();
		//	String s5=tf5.getText();
			String s3=tf3.getText();
			String s4=tf4.getText();

			 String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
			 String s5=tf5.getText();
		      Boolean b = s5.matches(EMAIL_REGEX);
		      if(b==true)
		      {
			if(s3.equals(s4))
			{
                UniversityStaff us=new UniversityStaff();
				
				us.setFirstn(s1);
				us.setLastn(s2);
				us.setEmailid(s5);
				us.setPassword(s4);
				
				try
				{
					int rowAffected=udi.addUniversityStaff(us);
					if(rowAffected==1)
					{
						JOptionPane.showMessageDialog(null,"THANKYOU FOR SIGNUP");
						this.setVisible(false);
						Home h=new Home();
					
					}
					else
						JOptionPane.showMessageDialog(null,"Error in insertion");
				}
				catch(Exception ea)
				{
					JOptionPane.showMessageDialog(null,ea);
				}
			
			}
			else
			{
				JOptionPane.showMessageDialog(this, "password and confirm password should be equal");
			}
		      }
		      else
		      {
		    	  JOptionPane.showMessageDialog(this, "ENTER A VALID EMAIL ID");
		      }
		
		
		}
		
		if(e.getSource()==b2)
		{
			tf1.setText("  ");
			tf2.setText("  ");
			tf3.setText("");
			tf4.setText("");
			tf5.setText(" ");
		}
		if(e.getSource()==b3)
		{  
			setVisible(false);
			Home h=new Home();
		}
		
		
	}

}
