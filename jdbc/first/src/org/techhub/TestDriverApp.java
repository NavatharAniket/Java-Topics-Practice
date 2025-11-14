package org.techhub;
import java.sql.*;
import java.util.Scanner;
public class TestDriverApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Scanner sc=new Scanner(System.in);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		if(conn!=null)
		{
			Statement stmt=conn.createStatement();	
			System.out.println("Enter id,name ,salary");
			int id=sc.nextInt();
			System.out.println("Insert name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Insert salary");
			int sal=sc.nextInt();
			int val=stmt.executeUpdate("insert into employee values("+id+",'"+name+"',"+sal+")");
			if(val>0)
			{
				System.out.println("data Inserted ");
			}
			else
			{
				System.out.println("Data not Inserted ");
			}
			
		}
		else
		{
			System.out.print("Not Copnnected");
		}
	}
 
}
