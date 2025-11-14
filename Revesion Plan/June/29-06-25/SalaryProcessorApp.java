import java.util.Scanner;

// Abstract Employee class
abstract class Employee {
    int id;
    String name;
    double basicSalary;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }

    // Abstract method to calculate net salary
    public abstract double calculateNetSalary();
}

// Manager subclass with 25% bonus
class Manager extends Employee {
    public double calculateNetSalary() {
        return basicSalary + (basicSalary * 0.25);
    }
}

// Developer subclass with 15% bonus
class Developer extends Employee {
    public double calculateNetSalary() {
        return basicSalary + (basicSalary * 0.15);
    }
}

// Intern subclass with 5% tax deduction (no bonus)
class Intern extends Employee {
    public double calculateNetSalary() {
        return basicSalary - (basicSalary * 0.05);
    }
}

public class SalaryProcessorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = sc.nextDouble();
            sc.nextLine(); // consume newline

            System.out.print("Enter Designation (Manager/Developer/Intern): ");
            String designation = sc.nextLine();

            if (designation.equalsIgnoreCase("Manager")) {
                Manager m = new Manager();
                m.setId(id);
                m.setName(name);
                m.setBasicSalary(basicSalary);
                employees[i] = m;
            } else if (designation.equalsIgnoreCase("Developer")) {
                Developer d = new Developer();
                d.setId(id);
                d.setName(name);
                d.setBasicSalary(basicSalary);
                employees[i] = d;
            } else if (designation.equalsIgnoreCase("Intern")) {
                Intern in = new Intern();
                in.setId(id);
                in.setName(name);
                in.setBasicSalary(basicSalary);
                employees[i] = in;
            } else {
                System.out.println("Invalid designation. Defaulting to Intern.");
                Intern in = new Intern();
                in.setId(id);
                in.setName(name);
                in.setBasicSalary(basicSalary);
                employees[i] = in;
            }
        }

        System.out.println("\n--- Employee Net Salaries ---");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + employees[i].getId());
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Net Salary: " + String.format("%.2f", employees[i].calculateNetSalary()));
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}
