package org.techhub;
import java.sql.*;
import java.util.*;

public class DeleteFromDatabase {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		Scanner sc=new Scanner(System.in);
		if(conn!=null)
		{
			System.out.println("Enter id ");
			int id=sc.nextInt();
			Statement stmt=conn.createStatement();
			int val=stmt.executeUpdate("delete from employee where id="+id+"");
			if(val>0)
			{
				System.out.println("Deleted from database ");
				
			}
			else
			{
				System.out.println("not deleted from database ");
			}
		}
		else
		{
			System.out.println("Connectuion not establish ");
		}
	}

}
