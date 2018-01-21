package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import beans.ManagementStaff;
import main.Main;

public class ManagementDaoImp {

	public boolean searchManagementStaff(String text, String password) throws SQLException
	{

		String sql="select * from ManagementStaff";
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

	

	public int addManagementStaff(ManagementStaff ms) throws SQLException
	{
		String sql="insert into ManagementStaff values(?,?,?,?)";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
				
		pstmt.setString(1,ManagementStaff.getFirstn());
		pstmt.setString(2,ManagementStaff.getLastn());
		pstmt.setString(3,ManagementStaff.getEmailid());
		pstmt.setString(4,ManagementStaff.getPassword());
		
		return pstmt.executeUpdate();
		
		
	}
	
	public int deleteManagementStaff(String emailid) throws SQLException
	{
		String sql="delete from ManagementStaff where Emailid='"+emailid+"'";
		PreparedStatement pstmt=Main.getCon().prepareStatement(sql);
	//	pstmt.setInt(1,Emailid);
		return pstmt.executeUpdate();
	}


	}



