package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.jfree.ui.RefineryUtilities;

public class Home extends JFrame implements ActionListener
{
		
	JFrame jf;
	JButton a,b,c,d;
	public Home()
	{	
		jf=new JFrame();	
	    jf.setTitle("                                                                                UNIVERSITY BUDGETING SYSTEM");
	    	
	   	JLabel l1=new JLabel("UNIVERSITY BUDGETING SYSTEM");
	   	l1.setForeground(Color.RED);
	   	Font f=new Font("Arial",Font.BOLD,40);
	   	l1.setFont(f);
	   	l1.setBounds(100, 10, 700, 40);
	    	
	   	JLabel l=new JLabel(new ImageIcon("Images/main.jpg"));
    	l.setBounds(0, 0, 800, 600);
    	
    	a=new JButton("Admin");
	    Font f2=new Font("Arial",Font.BOLD,20);
	    a.setFont(f2);
	    a.setForeground( Color.BLUE);
	    a.setBounds(300,130,220,40);
	        
	    b=new JButton("Management Staff");
	    b.setBounds(300,205,220,40);
	    Font f3=new Font("Arial",Font.BOLD,20);
	    b.setFont(f3);
	    b.setForeground( Color.BLUE);
	    
	    c=new JButton("University Staff");          
	    c.setBounds(300,280,220,40);
	    Font f4=new Font("Arial",Font.BOLD,20);
	    c.setFont(f4);
	    c.setForeground( Color.BLUE);
	    
	    d=new JButton("Signup");
	    d.setBounds(300,355,220,40);
	    Font f5=new Font("Arial",Font.BOLD,20);
	    d.setFont(f5);
	   	d.setForeground( Color.BLUE);
	        
        jf.setSize(800,600);    
	    jf.setLayout(null);    
	    jf.setContentPane(l);
	    jf.add(l1);
	    jf.add(a);
	    jf.add(b);
	     jf.add(c);
	     jf.add(d);
	        
	        a.addActionListener(this);
	        b.addActionListener(this);
	        c.addActionListener(this);
	        d.addActionListener(this);
	     

	        jf.setResizable(false);
	        RefineryUtilities.centerFrameOnScreen( jf);
	        jf.setVisible(true);
	        
	    }

	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource()== a)
		{
			jf.setVisible(false);
			AdminLogin al=new AdminLogin();	
		}
		if(arg0.getSource()==b)
		{
			jf.setVisible(false);
			ManagementLogin t=new ManagementLogin();
		}
		if(arg0.getSource()==c)
		{
			jf.setVisible(false);
			StaffLogin s=new StaffLogin();	
		}
		if(arg0.getSource()==d)
		{
			jf.setVisible(false);
			Signup s1=new Signup();
		}
		
		
	}
	}


