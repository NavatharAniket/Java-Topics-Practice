/*
Q1. WAP to create class name as Table with two functions 
void setValue(): this function is used for accept number from keyboard 
void showTable(): this function can display the table of number 
 
*/

import java.util.Scanner;
class Table
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}

	public void getTable()
	{
		for(int i=1;i<=10;i++)
		{
			int t=num*i;
			System.out.println(t);
		}
	}
}
class TableApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();

		Table t=new Table();
		t.setNum(num);
		t.getTable();

		
	}
}