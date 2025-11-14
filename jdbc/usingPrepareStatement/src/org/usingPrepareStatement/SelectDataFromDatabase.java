package org.usingPrepareStatement;
import java.sql.*;
public class SelectDataFromDatabase {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(conn!=null)
		{
			PreparedStatement stmt=conn.prepareStatement("Select * from Employee");
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" \t"+rs.getString(2)+" \t"+rs.getInt(3));
			}
		}
		else
		{
			System.out.println("Database are not Connected");
		}
	}

}
