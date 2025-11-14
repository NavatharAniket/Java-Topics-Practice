import java.util.Scanner;

class Patient {
    int id;
    String name;
    int admitDays;

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

    public void setAdmitDays(int admitDays) {
        this.admitDays = admitDays;
    }
    public int getAdmitDays() {
        return admitDays;
    }
}

class Bill extends Patient {
    double perDayCharge;

    public void setPerDayCharge(double perDayCharge) {
        this.perDayCharge = perDayCharge;
    }
    public double getPerDayCharge() {
        return perDayCharge;
    }

    public double calculateBill() {
        return perDayCharge * admitDays;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Admit Days: " + admitDays +
               ", Per Day Charge: " + perDayCharge +
               ", Total Bill: " + calculateBill();
    }
}

public class PatientBillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bill[] patients = new Bill[4];

        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Bill();

            System.out.println("Enter details for patient " + (i + 1));

            System.out.print("ID: ");
            patients[i].setId(sc.nextInt());

            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            patients[i].setName(sc.nextLine());

            System.out.print("Admit Days: ");
            patients[i].setAdmitDays(sc.nextInt());

            System.out.print("Per Day Charge: ");
            patients[i].setPerDayCharge(sc.nextDouble());

            sc.nextLine(); // consume newline
        }

        // Display bills
        System.out.println("\n--- Patient Bills ---");
        for (Bill b : patients) {
            System.out.println(b);
        }

        // Find max bill
        double maxBill = 0;
        for (Bill b : patients) {
            double bill = b.calculateBill();
            if (bill > maxBill) {
                maxBill = bill;
            }
        }

        System.out.println("\n--- Patient(s) with Maximum Bill (" + maxBill + ") ---");
        for (Bill b : patients) {
            if (b.calculateBill() == maxBill) {
                System.out.println(b);
            }
        }

        // Calculate average bill
        double sum = 0;
        for (Bill b : patients) {
            sum += b.calculateBill();
        }
        double avg = sum / patients.length;

        System.out.println("\nAverage Bill Amount: " + avg);

        sc.close();
    }
}
