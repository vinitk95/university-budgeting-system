package dao;

import java.sql.SQLException;

import beans.UpdateBudget;

public interface UpdateBudgetDao
{
	public int updateBudget(int Economics,int Humanities,int CivilEngineering,int ElectricalEngineering,int ElectronicEngineering,int InformationScience,int GenderStudies,int BiomedicalEngineering,int ComputerEngineering,int Botany)throws SQLException;
	public UpdateBudget generateReport() throws SQLException;

}
