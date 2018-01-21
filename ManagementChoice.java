package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.jfree.ui.RefineryUtilities;


public class ManagementChoice extends JFrame implements ActionListener
{
	

		JButton b1,b2,b3,b4,b5;
		JLabel l1;
		public ManagementChoice()
		{			
			l1 = new JLabel("SELECT OPERATION");
			l1.setForeground(Color.RED);
		   	Font f=new Font("Arial",Font.BOLD,30);
		   	l1.setFont(f);
		   	l1.setBounds(240, 10, 700, 80);
		    	setTitle("                                                                                             SELECT OPERATION");
		   	JLabel l=new JLabel(new ImageIcon("Images/water.jpg"));
	    	l.setBounds(0, 0, 800, 600);
			b1 = new JButton("UPDATE BUDGET");
			b2 = new JButton("VIEW BUDGET CHART");
			b3= new JButton("VIEW BUDGET REPORT");
			b4=new JButton("BACK");
			b5=new JButton("LOG OUT");
			
			setSize(800,600);
			setLayout(null);
	        setResizable(false);
			
	        
			b1.setBounds(100,180,200,80);
			b2.setBounds(450,180,200,80);
			b3.setBounds(100, 280, 200, 80);
			b4.setBounds(450,280,200,80);
			b5.setBounds(280, 380, 200, 80);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			
			setContentPane(l);
			add(l1);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			
			RefineryUtilities.centerFrameOnScreen(this);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent arg0)
		{
		if(arg0.getSource()==b1)
		{
			this.setVisible(false);
			UpdateBudgets ub=new UpdateBudgets();
			//Home h=new Home();
		}
		if(arg0.getSource()==b2)
		{
		Managepie m=new Managepie();

		}
		if(arg0.getSource()==b3)
		{
			Report r=new Report();
		}
		if(arg0.getSource()==b4)
		{
			setVisible(false);
			ManagementLogin ml=new ManagementLogin();
		}
		if(arg0.getSource()==b5)
		{
			JOptionPane.showMessageDialog(this, "YOU HAVE SUCESSFULLY LOGGED OUT");
			setVisible(false);
			Home h=new Home();
		}
		}

}

