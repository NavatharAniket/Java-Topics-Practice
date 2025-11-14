package org.jdbcpractice;
import java.sql.*;
public class InsertIntoDatabase {

	public static void main(String[] args) throws Exception{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql//localhost:3306/jdbcpractice","root","root");
		if(conn!=null)
		{
			System.out.println("Connection is establish");
			
		}
		else
		{
			System.out.println("Connection is not istablish ");
		}
	}

}
