package GUI;


import java.io.*; 
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import beans.UpdateBudget;
import dao.UpdateBudgetDaoImp;

	
public class Managepie {
   
   Managepie()
   {
    UpdateBudgetDaoImp ubdi=new UpdateBudgetDaoImp();  
    /*
      try{
      Class.forName( "oracle.jdbc.driver.OracleDriver" );
      Connection connect = DriverManager.getConnection( 
         "jdbc:oracle:thin:@localhost:1521:XE" ,     
         "SYSTEM",     
         "vinit9810727731");
      
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("select * from UpdateBudget" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
     while( resultSet.next( ) )
      {
         dataset.setValue( "ECONOMICS" , Double.parseDouble(resultSet.getString("Economics"))/100000);
         dataset.setValue( "HUMANITIES ", Double.parseDouble(resultSet.getString("Humanities"))/100000);
         dataset.setValue( "CIVIL ENGINEERING" , Double.parseDouble(resultSet.getString("CivilEngineering"))/100000);
         dataset.setValue( "ELECTRICAL ENGINEERING" , Double.parseDouble(resultSet.getString("ElectricalEngineering"))/100000);
         dataset.setValue( "ELECTRONIC ENGINEERING" , Double.parseDouble(resultSet.getString("ElectronicEngineering"))/100000);
         dataset.setValue("INFORMATION SCIENCE"  , Double.parseDouble(resultSet.getString("InformationScience"))/100000);
         dataset.setValue( "GENDER STUDIES" , Double.parseDouble(resultSet.getString("GenderStudies"))/100000);
         dataset.setValue( "BIOMEDICAL ENGINEERING" , Double.parseDouble(resultSet.getString("BiomedicalEngineering"))/100000);
         dataset.setValue( "COMPUTER ENGINEERING" , Double.parseDouble(resultSet.getString("ComputerEngineering"))/100000);
         dataset.setValue( "BOTANY" , Double.parseDouble(resultSet.getString("Botany"))/100000);
      }
      
      */
	   ubdi=new UpdateBudgetDaoImp();
	   try
		{
			UpdateBudget ub=ubdi.generateChart();
			/*txtName.setText(st.getName());
			txtMarks.setText(String.valueOf(st.getMarks()));
		*/
		      DefaultPieDataset dataset = new DefaultPieDataset( );

			 dataset.setValue( "ECONOMICS" , ub.getEconomics()/100000);
	         dataset.setValue( "HUMANITIES ",ub.getHumanities()/100000);
	         dataset.setValue( "CIVIL ENGINEERING" ,ub.getCivilEngineering()/100000);
	         dataset.setValue( "ELECTRICAL ENGINEERING" ,ub.getElectricalEngineering()/100000);
	         dataset.setValue( "ELECTRONIC ENGINEERING" , ub.getElectronicEngineering()/100000);
	         dataset.setValue("INFORMATION SCIENCE"  ,ub.getInformationScience()/100000);
	         dataset.setValue( "GENDER STUDIES" ,ub.getGenderStudies()/100000);
	         dataset.setValue( "BIOMEDICAL ENGINEERING" ,ub.getBiomedicalEngineering()/100000);
	         dataset.setValue( "COMPUTER ENGINEERING" , ub.getComputerEngineering()/100000);
	         dataset.setValue( "BOTANY" , ub.getBotany()/100000);
	   
      
      JFreeChart chart = ChartFactory.createPieChart("CHART OF UNIVERSITY BUDGET(in percentage(%))", dataset, true, true,  false );

      int width = 560;    /* Width of the image */
      int height = 370;   /* Height of the image */  
      JFrame frm=new JFrame();
      frm.setSize(800,600);
      frm.setContentPane(new ChartPanel( chart ));
		RefineryUtilities.centerFrameOnScreen(frm);

      frm.setVisible(true);
      }
      catch(Exception ae)
      {
    	  System.out.println(ae);
      }
   }
}
