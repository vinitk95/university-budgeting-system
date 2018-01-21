package main;

import java.sql.Connection;
import java.sql.SQLException;
import GUI.Home;
import dao.DataSource;

public class Main
{
	static Connection con;
	
	public static Connection getCon() {
		return con;
	}

	public static void main(String[] args) throws SQLException,ClassNotFoundException 
	{
		con=new DataSource().getDBConnection();
		Home h=new Home();
	}

}
