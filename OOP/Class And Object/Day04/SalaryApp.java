/*
3. WAP to create the class Employee with a following methods  
class Employee 
{   
void setPersonalInfo(String name,int id,int basicSal) 
    { //in this function we need to store name ,id and basicSal in instance variable 
    } 
    void setProgressPer(int progress) 
    { //if progress value is greater than 60 per then increase the basic salary of  
      //employee with 30 percentage  
    } 
    void show() 
    {//in this function we need to show the all details of employee like as  
     //name id and basic salary as well as incremental salary and total salary of employee 
    } 
} 
public class AreaApp 
{ 
    public static void main(String x[]) 
    {  // here create the object of Scanner class and accept the name id and basic salary as well  
       //progress per value not need to calculate it by using formual directly enter e.g 70  
       //means 70% 
      //create the object of Employee class and call setPersonalInfo and pass name id and salary 
     // in it as well as setProgressPer() and pass progress value in it 
    //call the show() method of Employee class. 
    } 
} 
*/

import java.util.Scanner;
class Employee
{
	private String name;
	private int id;
	private float basicSal;
	public void setPersonalInfo(String name,int id,float basicSal)
	{
		this.name=name;
		this.id=id;	
		this.basicSal=basicSal;
	}

	
	public void setProgressPer(int progress)
	{
		if(progress>60)
		{
			salary += (salary*30)/100;
		}
	}

	public void show()
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("Name : "+name);
		System.out.prinltn("Emp id "+id);
		System.out.println("Emp previous salary "+salary-(salary*30)/100);
		System.out.println("Increment in Salary "+((salary-(salary*30)/100)*30)/100);
		Sytemm.out.println("Total Salary "+salary);
	}

	
}

public class SalaryApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
	}
}














