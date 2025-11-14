package org.techhub;
import java.util.Scanner;
import java.sql.*;
public class UpdateFromDatabase {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		if(conn!=null)
		{
			Statement stmt=conn.createStatement();
			int val=stmt.executeUpdate("update employee set name='patil' where id=2");
			if(val>0){
				System.out.println("Updated Successfully ");
			}
			else
			{
				System.out.println("Not Updated ");
			}
		}
		else
		{
			System.out.println("Database Not Connected");
		}
	}

}
