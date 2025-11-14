package org.techhub;
import java.sql.*;
public class SelectRecordsFromDatabase {

	public static void main(String[] args)throws Exception {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		if(conn!=null)
		{
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
		}
		else
		{
			System.out.println("Connection not Establish");
		}
	}

}
