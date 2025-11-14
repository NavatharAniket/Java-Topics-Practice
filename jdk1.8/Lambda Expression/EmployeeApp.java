import java.util.*;
import java.util.function.*;

class Employee
{
	int id;
	String name;
	int sal;
	
	public Employee(String name,int id,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public String toString()
	{
		return "id "+id+" name "+name+" salary "+sal;  
	} 
}
class EmployeeApp
{
	public static void main(String[] args)
	{
	 List.of(new Employee("ABC",1,1000),new Employee("MNO",2,2000),new Employee("PQR",3,3000),new Employee("STV",4,4000),new Employee("XYZ",5,5000)).forEach((Employee e)->System.out.println(e.toString()));
	
	}
}