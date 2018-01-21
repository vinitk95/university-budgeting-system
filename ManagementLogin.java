package GUI;

	import java.awt.*;
	import javax.swing.*;

import org.jfree.ui.RefineryUtilities;

import beans.ManagementStaff;
import dao.ManagementDaoImp;


import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

		public class ManagementLogin extends JFrame implements ActionListener
		{
			JFrame jf3;
			JLabel l1,l2,li;
		    JTextField tf;
		    JButton b1,b2,b3;
		    //Font f ;
		    JPasswordField p;
			ManagementDaoImp mdi;

		    public ManagementLogin()
		    {	
		    	jf3=new JFrame();
		        
		    	//f= new Frame();
		    	jf3.setTitle("                                                                          MANAGEMENT LOGIN");
		    	JLabel l3=new JLabel("MANAGEMENT LOGIN");
		    	l3.setForeground(Color.BLUE);
		    	Font f=new Font("Arial",Font.BOLD,40);
		    	l3.setFont(f);
		    	l3.setBounds(200, 10, 500, 40);
		    	JLabel l=new JLabel(new ImageIcon("Images/water.jpg"));
		    	l.setBounds(0, 0, 800, 600);
		    	
		    	l1 = new JLabel("EMAIL ID");
		    	 Font f1=new Font("Arial",Font.BOLD,20);
		      	l1.setFont(f1);
		     	
		        l1.setForeground(Color.red);
		        l2 = new JLabel("PASSWORD");
		   	 Font f2=new Font("Arial",Font.BOLD,20);
		      	l2.setFont(f2);
		    
		        l2.setForeground(Color.RED);//(Color.red);
		        b1 = new JButton("LOGIN");
		   	 Font f3=new Font("Arial",Font.BOLD,20);
		      	b1.setFont(f3);
		    
		        b2 = new JButton("RESET");
		        Font f4=new Font("Arial",Font.BOLD,20);
		      	b2.setFont(f4);
		    
		        b3=new JButton("BACK");
		        Font f5=new Font("Arial",Font.BOLD,20);
		      	b3.setFont(f5);
		    
		        tf = new JTextField();
		        p = new JPasswordField(100);
		        jf3.setSize(800, 600);

		        l1.setBounds(100,150,150,30);
		        tf.setBounds(290,150,270,30);
		        l2.setBounds(100,230,160,30);
		        p.setBounds(290,230,270,30);
		        b1.setBounds(100,350,150,40);
		        b2.setBounds(320,350,150,40);
		        b3.setBounds(540, 350, 150, 40);
		        jf3.setLayout(null);
		        
		        mdi=new ManagementDaoImp();
		        
		        jf3.add(b1);
		        jf3.add(tf);
		        jf3.add(b2);
		        jf3.add(p);
		        jf3.add(l1);
		        jf3.add(l2);
		        jf3.add(b3);
		        jf3.add(l3);
		        b2.addActionListener(this);
		        b1.addActionListener(this);
		        b3.addActionListener(this);
		        
		      
		        li =new JLabel(new ImageIcon("management.png"));
		        
		        li.setBounds(0,0,800,400);
		        jf3.add(li);
		        jf3.setResizable(false);
		        RefineryUtilities.centerFrameOnScreen(jf3);
		        jf3.setVisible(true);
		        
		       // jf3.setContentPane(l);
		        jf3.add(l);
		        
		        
		        
		        }
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if(arg0.getSource()==b1)
				{
					try
					{
					boolean match= mdi.searchManagementStaff(tf.getText(),p.getText());
					
					if(match==true)
					{
						jf3.setVisible(false);
						ManagementChoice mc=new ManagementChoice();
					}
					else
					{
						JOptionPane.showMessageDialog(jf3, "Enter a valid Username and password");
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
					jf3.setVisible(false);
					Home h=new Home();

				}
			
			}	        
		}




