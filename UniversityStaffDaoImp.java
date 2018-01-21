package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.ManagementStaff;
import beans.UniversityStaff;
import main.Main;

public class UniversityStaffDaoImp 
{
	public boolean searchUniversitytStaff(String text, String password) throws SQLException
	{

		String sql="select * from UniversityStaff";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
		ResultSet rs= pstmt.executeQuery();
		ManagementStaff ms=new ManagementStaff();
		while(rs.next())
		{
			if(rs.getString(3).equals(text) && rs.getString(4).equals(password))
			{
			return true;
			}
			
		}
		
		return false;
	
	}
	
	public int addUniversityStaff(UniversityStaff us) throws SQLException
	{
		String sql="insert into UniversityStaff values(?,?,?,?)";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);		
		pstmt.setString(1,UniversityStaff.getFirstn());
		pstmt.setString(2,UniversityStaff.getLastn());
		pstmt.setString(3,UniversityStaff.getEmailid());
		pstmt.setString(4,UniversityStaff.getPassword());
		
		return pstmt.executeUpdate();
		
		//return 0;
	}

	public int deleteUniversityStaff(String emailid) throws SQLException
	{
		
		String sql="delete from UniversityStaff where Emailid='"+emailid+"'";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
		return pstmt.executeUpdate();

		
	}





}
