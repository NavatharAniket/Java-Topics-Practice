import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class Employee
{
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
		
	int id;
	String name;
	double salary;

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public String toString()
	{
		return "id "+getId()+" name "+getName()+" salary "+getSalary();
	}
}

class EmployeeApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Employee>v=new LinkedList<Employee>();

		do
		{
			System.out.println("1 for add");
			System.out.println("2 for display");
			System.out.println("3 for exit");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Enter ID");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name");
					String name=sc.nextLine();
					System.out.println("Enter salary");
					double sal=sc.nextDouble();

					v.add(new Employee(id,name,sal));
					System.out.println("Employee added successfully.");
					break;
				case 2:
					Iterator i=v.iterator();
					while(i.hasNext())
					{
						System.out.println(i.next().toString());
					}
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}while(true);
	}
}