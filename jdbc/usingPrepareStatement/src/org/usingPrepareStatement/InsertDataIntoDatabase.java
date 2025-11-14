package org.usingPrepareStatement;
import java.sql.*;
import java.util.*;
public class InsertDataIntoDatabase {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		if(conn!=null)
		{
			System.out.println("Enter id name and salary of employee");
			Scanner sc=new Scanner(System.in);
			
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int salary=sc.nextInt();
			
			PreparedStatement stmt=conn.prepareStatement("insert into employee values (?,?,?)");
			stmt.setInt(1,id);
			stmt.setString(2, name);
			stmt.setInt(3, salary);
			int val=stmt.executeUpdate();
			if(val>0)
			{
				System.out.println("Values are Inserted into database");
			}
			else
			{
				System.out.println("Values are not inserted into database");
			}
		}
		else
		{
			System.out.println("Not connected with database");
		}

	}

}
