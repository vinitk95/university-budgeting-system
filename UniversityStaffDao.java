package dao;

import java.sql.SQLException;

import beans.ManagementStaff;
import beans.UniversityStaff;
import beans.UpdateBudget;

public interface UniversityStaffDao 
{

	public boolean searchUniversityStaff(String Emailid,String Password)throws SQLException;
	public int addUniversityStaff(UniversityStaff us)throws SQLException;
	public void generateBudgetChart(int Economics,int Humanities,int CivilEngineering,int ElectricalEngineering,int ElectronicEngineering,int InformationScience,int GenderStudies,int BiomedicalEngineering,int ComputerEngineering,int Botany)throws SQLException;	
	public int deleteUniversityStaff(String emailid) throws SQLException;
}
