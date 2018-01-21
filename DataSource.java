package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
public Connection getDBConnection() throws SQLException,ClassNotFoundException
{
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="SYSTEM";
	String pwd="vinit9810727731";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	return DriverManager.getConnection(url,user,pwd);
}
}

