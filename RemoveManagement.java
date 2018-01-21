package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import org.jfree.ui.RefineryUtilities;

import dao.ManagementDaoImp;

public class RemoveManagement extends JFrame implements ActionListener
{
	JFrame jfr;
	JLabel l0,l1,l2;
	JButton b1,b2,b3,b4;
	JTextField tf;
	ManagementDaoImp mdi;
	RemoveManagement()
	{
		jfr=new JFrame();
		
		
		l1=new JLabel("REVOME MANAGEMENT STAFF");
		l1.setForeground(Color.RED);
    	Font f=new Font("Arial",Font.BOLD,30);
    	l1.setFont(f);
    	l1.setBounds(130, 20, 500, 40);
    	
    	l2=new JLabel("Enter the Email id");
		l2.setBounds(140, 150, 200, 30);
		Font f1=new Font("Arial",Font.BOLD,20);
		l2.setFont(f1);
		
		tf=new JTextField();
		tf.setBounds(400, 150, 300, 30);
		
		b1=new JButton("OK");
		b1.setBounds(130, 250, 200, 50);
		
		b2=new JButton("RESET");
		b2.setBounds(400,250, 200, 50);
		
		b3=new JButton("BACK");
		b3.setBounds(130, 350, 200, 50);
		
		b4=new JButton("LOG OUT");
		b4.setBounds(400, 350, 200, 50);
		
		JLabel l=new JLabel(new ImageIcon("Images/water.jpg"));
    	l.setBounds(0, 0, 800, 600);
    	
		jfr.setLayout(null);
		mdi=new ManagementDaoImp();
		jfr.setContentPane(l);
		jfr.add(l1);
		jfr.add(b1);
		jfr.add(b2);
		jfr.add(b3);
		jfr.add(b4);
		jfr.add(l1);
		jfr.add(l2);
		jfr.add(tf);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		jfr.setSize(800,600);
		jfr.setResizable(false);
		jfr.setLayout(null);
		RefineryUtilities.centerFrameOnScreen(jfr);
		jfr.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource()==b1)
		{
			String s=tf.getText();
			try
			{
			int rowAffected=mdi.deleteManagementStaff(tf.getText());
			if(rowAffected==1)
			{
				JOptionPane.showMessageDialog(null,"Deleted Successfully");
				tf.setText(" ");
			}else
				JOptionPane.showMessageDialog(null,"Error in Deletion");
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e);
			 
			}
		}
		if(arg0.getSource()==b2)
		{
			tf.setText(" ");
			
		}
		if(arg0.getSource()==b3)
		{
			jfr.setVisible(false);
			AdminChoice ac=new AdminChoice();
		}
		
		if(arg0.getSource()==b4)
		{
			jfr.setVisible(false);
			Home h=new Home();
		}
		
	}
}