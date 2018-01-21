package dao;

import beans.ManagementStaff;
import beans.UpdateBudget;

import java.sql.SQLException;

public interface ManagementDao
{
	public ManagementStaff searchManagementStaff(String Emailid,String Password)throws SQLException;
	//public int updateBudgetChart(int Economics,int Humanities,int CivilEngineering,int ElectricalEngineering,int ElectronicEngineering,int InformationScience,int GenderStudies,int BiomedicalEngineering,int ComputerEngineering,int Botany)throws SQLException;
	public int addManagementStaff(ManagementStaff ms)throws SQLException;
	public int deleteManagementStaff(String emailid) throws SQLException;

}
