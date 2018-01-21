package GUI;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import org.jfree.ui.RefineryUtilities;
import beans.UpdateBudget;
import dao.UpdateBudgetDaoImp;


public class Report extends JFrame 
{
	JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2;
	UpdateBudgetDaoImp ubdi;
	Report()
	{

		ubdi=new UpdateBudgetDaoImp();
		try
		{
			UpdateBudget ub=ubdi.generateReport();
			l1=new JLabel("1.THE BUDGET FOR ECONOMICS IS  "+ub.getEconomics()+"  Rupees");
			l2=new JLabel("2.THE BUDGET FOR HUMANITIES IS  "+ub.getHumanities()+" Rupees");
			l3=new JLabel("3.THE BUDGET FOR CIVIL ENGINEERING IS  "+ub.getCivilEngineering()+" Rupees");
			l4=new JLabel("4.THE BUDGET FOR ELECTRICAL ENGINEERING IS  "+ub.getElectricalEngineering()+" Rupees");
			l5=new JLabel("5.THE BUDGET FOR ELECTRONIC ENGINEERING IS  "+ub.getElectronicEngineering()+" Rupees");
			l6=new JLabel("6.THE BUDGET FOR INFORMATION SCIENCE IS  "+ub.getInformationScience()+" Rupees");
			l7=new JLabel("7.THE BUDGET FOR GENDER STUDIES IS  "+ub.getGenderStudies()+" Rupees");
			l8=new JLabel("8.THE BUDGET FOR BIOMEDICAL ENGINEERING IS  "+ub.getBiomedicalEngineering()+" Rupees");
			l9=new JLabel("9.THE BUDGET FOR COMPUTER ENGINEERING IS  "+ub.getComputerEngineering()+" Rupees");
			l10=new JLabel("10.THE BUDGET FOR BOTANY IS  "+ub.getBotany()+" Rupees");

		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
		
		l0=new JLabel("                              REPORT OF UNIVERSITY BUDGET ");
			l0.setBounds(20, 20, 600, 40);
			Font f1= new Font("Areal",Font.BOLD,20);
			l0.setFont(f1);
			l0.setForeground(Color.red);
			l1.setBounds(70, 90, 500, 20);
			l2.setBounds(70, 140, 500, 20);
			l3.setBounds(70, 190, 500, 20);
			l4.setBounds(70, 240, 500, 20);
			l5.setBounds(70, 290, 500, 20);
			l6.setBounds(70, 340, 500, 20);
			l7.setBounds(70, 390, 500, 20);
			l8.setBounds(70, 440, 500, 20);
			l9.setBounds(70, 490, 500, 20);
			l10.setBounds(70, 540, 500, 20);
			
			Font f=new Font("Arial",Font.BOLD,15);
	    	JLabel l=new JLabel(new ImageIcon("Images/back.jpg"));	
	    	l.setBounds(0, 0, 800, 600);

	                
	    	l1.setFont(f);
	    	l2.setFont(f);
	    	l3.setFont(f);
	    	l4.setFont(f);
	    	l5.setFont(f);
	    	l6.setFont(f);
	    	l7.setFont(f);
	    	l8.setFont(f);
	    	l9.setFont(f);
	    	l10.setFont(f);

	    	setContentPane(l);
	    	add(l1);
			add(l0);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			add(l6);
			add(l7);
			add(l8);
			add(l9);
			add(l10);
			
	       
			setSize(800,600);
		    setLocationRelativeTo(null);
		    setVisible(true);
	}
		
}
