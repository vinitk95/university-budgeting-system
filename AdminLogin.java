package GUI;


import java.awt.*;
import javax.swing.*;

import org.jfree.ui.RefineryUtilities;

import java.awt.event.*;

	public class AdminLogin extends JFrame implements ActionListener
	{
		JFrame jf2;
		JLabel l1,l2,li,image;
	    JTextField tf;
	    JButton b1,b2,b3;
	    JPasswordField p;
	    AdminLogin()
	    {	
	    	jf2=new JFrame();
	        
	    	
	    	jf2.setTitle("                                                                                                           ADMIN LOGIN");
	    	JLabel l3=new JLabel("ADMIN LOGIN");
	
	    	Font f=new Font("Arial",Font.BOLD,40);

	    	Font f2=new Font("Arial",Font.BOLD,20);
	    	
	    	l3.setFont(f);
	    	l3.setBounds(250, 40, 500, 40);
	    	
	    	l1 = new JLabel("User Name");
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
	        jf2.setSize(800, 600);


	        l1.setBounds(100,150,150,30);
	        tf.setBounds(290,150,270,30);
	        l2.setBounds(100,230,110,30);
	        p.setBounds(290,230,270,30);
	        b1.setBounds(100,350,150,40);
	        b2.setBounds(320,350,150,40);
	        b3.setBounds(540, 350, 150, 40);
	        jf2.setLayout(null);
	        
	        jf2.add(b1);
	        jf2.add(tf);
	        jf2.add(b2);
	        jf2.add(p);
	        jf2.add(l1);
	        jf2.add(l2);
	        jf2.add(b3);
	        jf2.add(l3);
	        b2.addActionListener(this);
	        b1.addActionListener(this);
	        b3.addActionListener(this);
	        
	        image = new JLabel(new ImageIcon("Images/back.jpg"));
	        image.setBounds(0,0,800,600);
	        jf2.add(image);
	        
	        RefineryUtilities.centerFrameOnScreen(jf2);
	        jf2.setResizable(false);
	        jf2.setVisible(true);
	        }
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			if(arg0.getSource()==b1)
			{
				String nm=tf.getText();
				String pw=p.getText();
				
				if(nm.equals("Admin") && pw.equals("Admin123"))
				{	
					jf2.setVisible(false);
					AdminChoice a= new AdminChoice();
				}
				else
				{
					JOptionPane.showMessageDialog(jf2, "ENTER A VALID USERNAME AND PASSWORD");
				}
				
			}
			if(arg0.getSource()==b2)
			{
				tf.setText(" ");
				p.setText("");
			}
			if(arg0.getSource()==b3)
			{
				jf2.setVisible(false);
				Home h=new Home();

			}
		
		}	        
	}


