import java.util.Scanner;
abstract class Payable 
{
	String name;
	Payable(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	abstract double calculateSalary();
}

class FullTimeEmployee extends Payable
{
	double monthlySalary;
	FullTimeEmployee(double monthlySalary,String name)
	{
		super(name);
		this.monthlySalary=monthlySalary;
	}

	
	double calculateSalary()
	{
		return monthlySalary;
	}
}

class PartTimeEmployee extends Payable
{
	double hourlyRate;
	int hoursWorked;
	PartTimeEmployee(double hourlyRate,String name,int hoursWorked)
	{
		super(name);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	double calculateSalary()
	{
		return (double)(hoursWorked*hoursWorked);
	}
}

class SalaryApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Payable p=null;
		do
		{
			System.out.println("1 for FullTimeEmployee ");
			System.out.println("2 for Payable ");
			System.out.println("3 for exit ");
			System.out.println("Enter Your choice");
			int ch=sc.nextInt();
			int price=0;
			System.out.println("Enter Name of Employee");
			String name=sc.nextLine();
			sc.nextLine();
			switch(ch)
			{
				case 1: 
					System.out.println("Enter Mouthly payment");
					double payment=sc.nextDouble();
					 p=new FullTimeEmployee(payment,name);
					break;
				case 2:
					System.out.println("Enter houser work");
					int h=sc.nextInt();
					System.out.println("Enter hourlyRate ");
					double hourlyRate=sc.nextDouble();
					p=new PartTimeEmployee(hourlyRate,name,h);
					break;

				case 3:
					System.exit(0);
				default:
					System.out.println("Enter Valid Choice");
				
					
			}
			System.out.println("Salary of employee "+ p.getName() +" is "+p.calculateSalary());
		}while(true);

	}
}