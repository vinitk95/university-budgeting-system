package GUI;


import java.awt.*;
import javax.swing.*;

import org.jfree.ui.RefineryUtilities;

import dao.ManagementDaoImp;
import dao.UniversityStaffDaoImp;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

	public class StaffLogin extends JFrame implements ActionListener
	{
		JFrame jf6;
		JLabel l1,l2,image;
	    JTextField tf;
	    JButton b1,b2,b3;
	    //Font f ;
	    JPasswordField p;
	    
    	Font f=new Font("Arial",Font.BOLD,40);

    	Font f2=new Font("Arial",Font.BOLD,20);
		UniversityStaffDaoImp udi;

	    StaffLogin()
	    {	
	    	jf6=new JFrame();
	        
	    	//f= new Frame();
	    	jf6.setTitle("LOGIN SCREEN");
	    	JLabel l3=new JLabel("STAFF LOGIN");
	    	l3.setForeground(Color.BLUE);
	    	l3.setFont(f);
	    	l3.setBounds(250, 40, 500, 40);
	    	
	    	l1 = new JLabel("Email Id");
	        l1.setForeground(Color.red);
	        l1.setFont(f2);
	        l2 = new JLabel("Password");
	        l2.setForeground(Color.RED);//(Color.red);
	        l2.setFont(f2);
	        b1 = new JButton("LOGIN");
	        b1.setFont(f2);
	        b2 = new JButton("RESET");
	        b2.setFont(f2);
	        b3=new JButton("BACK");
	        b3.setFont(f2);
	        tf = new JTextField();
	        tf.setFont(f2);
	        p = new JPasswordField(100);
	        p.setFont(f2);
	        jf6.setSize(800, 600);
	       // setBackground(Color.gray);
	        /*l1.setBounds(100,150,150,30);
	        tf.setBounds(240,150,270,30);
	        l2.setBounds(100,230,110,30);
	        p.setBounds(240,230,270,30);
	        b1.setBounds(100,350,100,40);
	        b2.setBounds(260,350,100,40);
	        b3.setBounds(420, 350, 100, 40);
	        */  l1.setBounds(100,150,150,30);
	        tf.setBounds(290,150,270,30);
	        l2.setBounds(100,230,160,30);
	        p.setBounds(290,230,270,30);
	        b1.setBounds(100,350,150,40);
	        b2.setBounds(320,350,150,40);
	        b3.setBounds(540, 350, 150, 40);
	        jf6.setLayout(null);
	        
	        udi=new UniversityStaffDaoImp();

	        
	     //   jf2.setResizable(true);
	        jf6.add(b1);
	        jf6.add(tf);
	        jf6.add(b2);
	        jf6.add(p);
	        jf6.add(l1);
	        jf6.add(l2);
	        jf6.add(b3);
	        jf6.add(l3);
	        b2.addActionListener(this);
	        b1.addActionListener(this);
	        b3.addActionListener(this);
	        
	      
	        image = new JLabel(new ImageIcon("Images/back.jpg"));
	        image.setBounds(0,0,800,600);
	        jf6.add(image);
	        jf6.setResizable(false);
	        RefineryUtilities.centerFrameOnScreen(jf6);
	        jf6.setVisible(true);
	        }
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			if(arg0.getSource()==b1)
			{

				try
				{
				boolean match= udi.searchUniversitytStaff(tf.getText(),p.getText());
				
				if(match==true)
				{
					jf6.setVisible(false);
					Staff f=new Staff();
				}
				else
				{
					JOptionPane.showMessageDialog(jf6, "Enter a valid Username and password");
				}
			
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}				
			}
			if(arg0.getSource()==b2)
			{
				tf.setText(" ");
				p.setText("");
			}
			if(arg0.getSource()==b3)
			{
				jf6.setVisible(false);
				Home h=new Home();
			}
		
		}	        
	}





