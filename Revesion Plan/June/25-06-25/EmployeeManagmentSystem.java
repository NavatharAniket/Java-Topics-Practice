import java.util.Scanner;

class Employee {
	int empId;
	String name;
	String department;
	double salary;

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}

class EmployeeManagmentSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] empl = new Employee[5];

		
		for (int i = 0; i < empl.length; i++) {
			empl[i] = new Employee();

			System.out.println("Enter Employee ID:");
			int id = sc.nextInt();
			empl[i].setEmpId(id);

			System.out.println("Enter Employee Name:");
			sc.nextLine(); // consume leftover newline
			String name = sc.nextLine();
			empl[i].setName(name);

			System.out.println("Enter Employee Department:");
			String dept = sc.nextLine();
			empl[i].setDepartment(dept);

			System.out.println("Enter Employee Salary:");
			double salary = sc.nextDouble();
			empl[i].setSalary(salary);
		}

	
		for (int i = 0; i < empl.length; i++) {
			if (empl[i].getDepartment().equalsIgnoreCase("IT")) {
				double newSalary = empl[i].getSalary() * 1.10;
				empl[i].setSalary(newSalary);
			}
		}

		
		System.out.println(" Employee Details After Increment");
		for (int i = 0; i < empl.length; i++) {
			System.out.println("ID: " + empl[i].getEmpId());
			System.out.println("Name: " + empl[i].getName());
			System.out.println("Department: " + empl[i].getDepartment());
			System.out.println("Salary: " + empl[i].getSalary());
			System.out.println("--------------------------------------");
		}
	}
}
