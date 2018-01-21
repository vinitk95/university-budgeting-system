package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.jfree.ui.RefineryUtilities;


public class AdminChoice extends JFrame implements ActionListener
{
	
	JFrame jfa;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	JLabel l1,l;
	
	AdminChoice()
	{
		jfa=new JFrame();
		l1=new JLabel("ADIMINISTRATOR");
		l1.setForeground(Color.BLUE);
    	Font f=new Font("Arial",Font.BOLD,40);
    	l1.setFont(f);
    	l1.setBounds(220, 10, 500, 40);
    	
     	l=new JLabel(new ImageIcon("Images/water.jpg"));
    	l.setBounds(0, 0, 800, 600);
    	
		jb1=new JButton("REMOVE MANAGEMENT STAFF");
		jb1.setBounds(100, 150, 250, 70);
		jb2=new JButton("REMOVE UNIVERSITY STAFF");
		jb2.setBounds(400, 150, 250, 70);
		jb3=new JButton("VIEW MANAGEMENT STAFF");
		jb3.setBounds(100,250,250,70);
		jb4=new JButton("VIEW UNIVERSITY STAFF");
		jb4.setBounds(400,250,250,70);
		jb5=new JButton("VIEW BUDGET CHART");
		jb5.setBounds(100, 350, 250, 70);
		jb6=new JButton("VIEW BUDGET REPORT");
		jb6.setBounds(400,350, 250, 70);
		jb7=new JButton("SIGN OUT");
		jb7.setBounds(250,450,250,70);
		jfa.setLayout(null);
		jfa.add(l1);
		jfa.add(jb1);
		jfa.add(jb2);
		jfa.add(jb3);
		jfa.add(jb4);
		jfa.add(jb5);
		jfa.add(jb6);
		jfa.add(jb7);
		jfa.add(l);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		
		jfa.setSize(800, 600);
	      RefineryUtilities.centerFrameOnScreen(jfa);        

		jfa.setVisible(true);
	}
		public void actionPerformed(ActionEvent arg0)
		{
			if(arg0.getSource()==jb1)
			{	jfa.setVisible(false);
				RemoveManagement r=new RemoveManagement();
			}
			if(arg0.getSource()==jb2)
			{	
				jfa.setVisible(false);
				RemoveStaff rs=new RemoveStaff();
			}
			if(arg0.getSource()==jb3)
			{
				ViewManagementStaff vms=new ViewManagementStaff();
			}
			if(arg0.getSource()==jb4)
			{
				ViewUniversityStaff s=new ViewUniversityStaff();
			}
			if(arg0.getSource()==jb5)
			{
				Managepie mp=new Managepie();
			}
			if(arg0.getSource()==jb6)
			{
				Report r=new Report();
			}
			if(arg0.getSource()==jb7)
			{	
				JOptionPane.showMessageDialog(jfa,"YOU HAVE SUCCESSFULLY LOGGED OUT");
				jfa.setVisible(false);
				Home h= new Home();
			}
		}
	
}
