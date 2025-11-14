/*
Q1. WAP to create class name as Table with functions 
 void setValue():  this function is used for accept the number as input parameter 
 void showTable(): this function can display the table of numbers.
*/

import java.util.Scanner;
class Table
{
	int tableNo;
	
	public void setValue(int no)
	{
		tableNo=no;
	}
	public void getValue()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(tableNo+" * "+i+" = "+tableNo*i);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Table t=new Table();
		System.out.println("Enter Table Number");
		int no=sc.nextInt();
		t.setValue(no);
		t.getValue();
	}
}