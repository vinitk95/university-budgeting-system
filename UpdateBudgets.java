package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;

import org.jfree.ui.RefineryUtilities;

//import bean.Student;
import beans.UpdateBudget;
import dao.UpdateBudgetDaoImp;

public class UpdateBudgets extends JFrame implements ActionListener 
{


	private static final long serialVersionUID = 1L;


	private static final beans.UpdateBudget UpdateBudget = null;


	Font font=new Font("Arial",Font.BOLD,30);
		
		JFrame f2;
		JButton b1,b2,b3,logout;
		Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,t,l0;
		TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
		UpdateBudgetDaoImp ubdi;
		UpdateBudgets()
		{
		
		f2= new JFrame("                                                                                 Management Screen");

    		
			tf1= new TextField();
			tf2= new TextField();
			tf3= new TextField();
			tf4= new TextField();
			tf5= new TextField();
			tf6= new TextField();		
			tf7= new TextField();
			tf8= new TextField();
			tf9= new TextField();
			tf10= new TextField();

	    	t= new Label("UPDATE BUDGET");
	    	t.setFont(font);
			t.setBounds(250,15, 400,40);
			
			l0=new Label("THE BUDGET OF UNIVERSITY IS 1 CRORE");
			l0.setBounds(200,70, 400, 20);
			tf1.setBounds(270, 100, 100, 20);
			tf2.setBounds(270, 150, 100, 20);
			tf3.setBounds(270, 200, 100, 20);
			tf4.setBounds(270, 250, 100, 20);
			tf5.setBounds(270, 300, 100, 20);
			tf6.setBounds(620, 100, 100, 20);
			tf7.setBounds(620, 150, 100, 20);
			tf8.setBounds(620, 200, 100, 20);
			tf9.setBounds(620, 250, 100, 20);
			tf10.setBounds(620, 300, 100, 20);
			l1= new Label("ECONOMICS");
			Font f=new Font("Arial",Font.BOLD,14);
	    	l1.setFont(f);
	    	
	    	//l1.setForeground(Color.WHITE);
	    	//l1.setForeground(Color.PINK);
	    	
			l2= new Label("HUMANITIES");
			l2.setFont(f);
			l3= new Label("CIVIL ENGINEERING");
			l3.setFont(f);
			l4= new Label("ELECTRICAL ENGINEERING");
			l4.setFont(f);
			l5= new Label("ELECTRONIC ENGINEERING");
			l5.setFont(f);
			l6= new Label("INFORMATION SCIENCE");
			l6.setFont(f);
			l7= new Label("GENDER STUDIES");
			l7.setFont(f);
			l8= new Label("BIOMEDICAL ENGINEERING");
			l8.setFont(f);
			
			l9= new Label("COMPUTER ENGINEERING");
			l9.setFont(f);
			l10= new Label("BOTANY");
			l10.setFont(f);
			l1.setBounds(50, 100, 200, 20);
			l2.setBounds(50, 150, 200, 20);
			l3.setBounds(50, 200, 200, 20);
			l4.setBounds(50, 250, 200, 20);
			l5.setBounds(50, 300, 200, 20);
			l6.setBounds(400, 100, 200, 20);
			l7.setBounds(400, 150, 200, 20);
			l8.setBounds(400, 200, 200, 20);
			l9.setBounds(400, 250, 200, 20);
			l10.setBounds(400, 300, 200, 20);
			
			 b1 = new JButton("SUBMIT");
		//	b1.setBackground(Color.blue);
			 b1.setFont(f);
			 
			 b2 = new JButton("RESET");
			 b2.setFont(f);
			 b3 = new JButton("BACK");
			 b3.setFont(f);
			 logout = new JButton("LOGOUT");
			 logout.setFont(f);
			 b1.setBounds(50, 400, 120, 40);
			 b2.setBounds(240, 400, 120, 40);
			 b3.setBounds(430, 400, 120, 40);
			 logout.setBounds(620, 400, 120, 40);
			 ubdi=new UpdateBudgetDaoImp();
			 f2.add(logout);
			 f2.add(tf1);
			 f2.add(tf2);
			 f2.add(l0);
			 f2.add(tf3);
			 f2.add(tf4);
			 f2.add(tf5);
			 f2.add(tf6);
			 f2.add(tf7);
			 f2.add(tf8);
			 f2.add(tf9);
			 f2.add(tf10);
			 f2.add(t);
			f2.add(l1);
			f2.add(l2);
			f2.add(l3);
			f2.add(l4);
			f2.add(l5);
			f2.add(l6);
			f2.add(l7);
			f2.add(l8);
			f2.add(l9);
			f2.add(l10);
			f2.add(b1);
			f2.add(b2);
			f2.add(b3);
			f2.setSize(800,600);
			JLabel l=new JLabel(new ImageIcon("Images/back.jpg"));
	    	l.setBounds(0, 0, 800, 600);
	    	
			f2.add(l);
			//f2.setContentPane(l);
			//f2.getContentPane().setBackground(Color.darkGray);
			f2.setResizable(false);
			f2.setLayout(null);
			RefineryUtilities.centerFrameOnScreen( f2);
			//RefineryUtilities.centerFrameOnScreen(f2);
			
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		logout.addActionListener(this);
		f2.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
	if(arg0.getSource()==b1)
	{
		
		
		String s1=tf1.getText();
		String s2=tf2.getText();
		String s3=tf3.getText();
		String s4=tf4.getText();
		String s5=tf5.getText();
		String s6=tf6.getText();
		String s7=tf7.getText();
		String s8=tf8.getText();
		String s9=tf9.getText();
		String s10=tf10.getText();
		
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=Integer.parseInt(s3);
		int d=Integer.parseInt(s4);
		int e=Integer.parseInt(s5);
		int f=Integer.parseInt(s6);
		int g=Integer.parseInt(s7);
		int h=Integer.parseInt(s8);
		int i=Integer.parseInt(s9);
		int j=Integer.parseInt(s10);
		
		int total=a+b+c+d+e+f+g+h+i+j;
		
		if(total<=10000000)
		{
			try
			{
				UpdateBudget ub=new UpdateBudget();
				ub.setEconomics(a);
				ub.setHumanities(b);
				ub.setCivilEngineering(c);
				ub.setElectricalEngineering(d);
				ub.setElectronicEngineering(e);
				ub.setInformationScience(f);
				ub.setGenderStudies(g);
				ub.setBiomedicalEngineering(h);
				ub.setComputerEngineering(i);
				ub.setBotany(j);
				int rowAffected=ubdi.updateBudget(ub);
				if(rowAffected==1)
				{
					JOptionPane.showMessageDialog(null,"BUDGET UPDATED SUCCESSFULL");
					f2.setVisible(false);
					ManagementChoice mc=new ManagementChoice();
				
				}else
					JOptionPane.showMessageDialog(null,"Error in Updation");
			}
			catch(Exception ea)
			{
				JOptionPane.showMessageDialog(null,ea);
			}
		
		
		}
		else
		{
			JOptionPane.showMessageDialog(f2, "you can't exceed beyond 1 crore");
			
		}
		
	}
	if(arg0.getSource()==b2)
	{
		tf1.setText(" ");
		tf2.setText("");
	}
	if(arg0.getSource()==b3)
	{
		f2.setVisible(false);
		ManagementChoice m=new ManagementChoice();
	}		
	if(arg0.getSource()==logout)
	{
		f2.setVisible(false);
		Home h=new Home();
	}
	
	}

	
}


