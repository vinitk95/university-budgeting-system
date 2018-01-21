package GUI;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ViewUniversityStaff 
{

	ViewUniversityStaff ()
	{
Vector columnNames = new Vector();
Vector data = new Vector();
JPanel p=new JPanel();

try 
{
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="SYSTEM";
	String pwd="vinit9810727731";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection(url,user,pwd);
String sql = "Select * from UniversityStaff";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery( sql );
ResultSetMetaData md = rs.getMetaData();
int columns = md.getColumnCount();
for (int i = 1; i <= columns; i++) {
columnNames.addElement( md.getColumnName(i) );
}
while (rs.next()) {
Vector row = new Vector(columns);
for (int i = 1; i <= columns; i++){
row.addElement( rs.getObject(i) );
}
data.addElement( row );
}
rs.close();
stmt.close();
}
catch(Exception e){
System.out.println(e);
}
JTable table = new JTable(data, columnNames);
TableColumn col;
for (int i = 0; i < table.getColumnCount(); i++) {
col = table.getColumnModel().getColumn(i);
col.setMaxWidth(250);
}
JScrollPane scrollPane = new JScrollPane( table );
//p.add( scrollPane );
//p.setBackground(Color.BLUE);
//JLabel l=new JLabel(new ImageIcon("Images/water.jpg"));
//p.add(l);
JFrame f=new JFrame();
f.setTitle("LIST OF UNIVERSITY STAFF");
//f.add(p);
f.add(scrollPane);
f.setSize(800,600);
f.setVisible(true);
}
}
