import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new LinkedList<>();

        while (true) {
            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter ID:");
            int id = sc.nextInt();

            System.out.println("Enter Salary:");
            int salary = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            Employee e = new Employee(name, id, salary);
            list.add(e);

            System.out.println("Type 1 to stop adding, 0 to continue:");
            int temp = sc.nextInt();
            sc.nextLine(); // consume newline
            if (temp == 1) {
                break;
            }
        }

        System.out.println("\nList of Employees:");
        for (Employee emp : list) {
            System.out.println(emp);  
	}
    }
}
