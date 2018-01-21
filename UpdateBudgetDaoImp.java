package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import beans.UpdateBudget;
import main.Main;

public class UpdateBudgetDaoImp 
{
	

	public int updateBudget(UpdateBudget ub)throws SQLException
	{
		// TODO Auto-generated method stub
		String sql="update updateBudget set Economics=?,Humanities=?,CivilEngineering=?,ElectricalEngineering=?,ElectronicEngineering=?,InformationScience=?,GenderStudies=?,BiomedicalEngineering=?,ComputerEngineering=?,Botany=?";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
		//int getEconomics();
		pstmt.setInt(1,ub.getEconomics());
		pstmt.setInt(2,ub.getHumanities());
		pstmt.setInt(3,ub.getCivilEngineering());
		pstmt.setInt(4,ub.getElectricalEngineering());
		pstmt.setInt(5,ub.getElectronicEngineering());
		pstmt.setInt(6,ub.getInformationScience());
		pstmt.setInt(7,ub.getGenderStudies());
		pstmt.setInt(8,ub.getBiomedicalEngineering());
		pstmt.setInt(9,ub.getComputerEngineering());
		pstmt.setInt(10,ub.getBotany());


		return pstmt.executeUpdate();	
	
	}
	
	public UpdateBudget generateReport() throws SQLException
	{
		// TODO Auto-generated method stub
		String sql="select * from UpdateBudget";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
		ResultSet rs= pstmt.executeQuery();
		UpdateBudget ub=new UpdateBudget();
		if(rs.next())
		{
			ub.setEconomics(rs.getInt(1));
			ub.setHumanities(rs.getInt(2));
			ub.setCivilEngineering(rs.getInt(3));
			ub.setElectricalEngineering(rs.getInt(4));
			ub.setElectronicEngineering(rs.getInt(5));
			ub.setInformationScience(rs.getInt(6));
			ub.setGenderStudies(rs.getInt(7));
			ub.setBiomedicalEngineering(rs.getInt(8));
			ub.setComputerEngineering(rs.getInt(9));
			ub.setBotany(rs.getInt(10));
		}
		return ub;
	}

	public UpdateBudget generateChart() throws SQLException
	{
		String sql="select * from UpdateBudget";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
		ResultSet rs= pstmt.executeQuery();
		UpdateBudget ub=new UpdateBudget();
		if(rs.next())
		{
			ub.setEconomics(rs.getInt(1));
			ub.setHumanities(rs.getInt(2));
			ub.setCivilEngineering(rs.getInt(3));
			ub.setElectricalEngineering(rs.getInt(4));
			ub.setElectronicEngineering(rs.getInt(5));
			ub.setInformationScience(rs.getInt(6));
			ub.setGenderStudies(rs.getInt(7));
			ub.setBiomedicalEngineering(rs.getInt(8));
			ub.setComputerEngineering(rs.getInt(9));
			ub.setBotany(rs.getInt(10));
		}
		return ub;
	}
	


}
