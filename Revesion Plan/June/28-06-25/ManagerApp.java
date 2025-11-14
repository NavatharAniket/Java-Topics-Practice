import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

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

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    String department;
    double bonusPercent;

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }
    public double getBonusPercent() {
        return bonusPercent;
    }

    // Calculate bonus amount
    public double getBonusAmount() {
        return (basicSalary * bonusPercent) / 100.0;
    }

    // Calculate net salary = basicSalary + bonus
    public double getNetSalary() {
        return basicSalary + getBonusAmount();
    }

    @Override
    public String toString() {
        return "EmpID: " + empId +
               ", Name: " + name +
               ", Department: " + department +
               ", Basic Salary: " + basicSalary +
               ", Bonus Percent: " + bonusPercent +
               ", Bonus Amount: " + getBonusAmount() +
               ", Net Salary: " + getNetSalary();
    }
}

public class ManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager[] managers = new Manager[5];

        // Input managers
        for (int i = 0; i < managers.length; i++) {
            managers[i] = new Manager();
            System.out.println("Enter details for Manager " + (i + 1));

            System.out.print("Employee ID: ");
            managers[i].setEmpId(sc.nextInt());
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            managers[i].setName(sc.nextLine());

            System.out.print("Department: ");
            managers[i].setDepartment(sc.nextLine());

            System.out.print("Basic Salary: ");
            managers[i].setBasicSalary(sc.nextDouble());

            System.out.print("Bonus Percent: ");
            managers[i].setBonusPercent(sc.nextDouble());
            sc.nextLine(); // consume newline
        }

        // Display all managers with their net salary and bonus
        System.out.println("\n--- Managers Details ---");
        for (Manager m : managers) {
            System.out.println(m);
        }

        // Calculate department-wise total bonus
        System.out.println("\n--- Department-wise Total Bonus ---");
        // Use simple approach: collect unique departments and sum bonuses per department
        String[] departments = new String[managers.length];
        double[] deptBonusTotals = new double[managers.length];
        int deptCount = 0;

        for (Manager m : managers) {
            String dept = m.getDepartment();
            double bonus = m.getBonusAmount();

            int index = -1;
            for (int i = 0; i < deptCount; i++) {
                if (departments[i].equals(dept)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                // New department
                departments[deptCount] = dept;
                deptBonusTotals[deptCount] = bonus;
                deptCount++;
            } else {
                // Existing department
                deptBonusTotals[index] += bonus;
            }
        }

        for (int i = 0; i < deptCount; i++) {
            System.out.println("Department: " + departments[i] + ", Total Bonus: " + deptBonusTotals[i]);
        }

        // Find manager with least bonus
        Manager leastBonusManager = managers[0];
        for (int i = 1; i < managers.length; i++) {
            if (managers[i].getBonusAmount() < leastBonusManager.getBonusAmount()) {
                leastBonusManager = managers[i];
            }
        }

        System.out.println("\n--- Manager with Least Bonus ---");
        System.out.println(leastBonusManager);

        sc.close();
    }
}
