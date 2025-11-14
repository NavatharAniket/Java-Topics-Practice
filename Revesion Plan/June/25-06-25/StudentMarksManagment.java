import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public int getTotal() {
        return marks1 + marks2 + marks3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }
}

class StudentMarksManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.println("Enter Roll No:");
            int rollNo = sc.nextInt();
            students[i].setRollNo(rollNo);

            System.out.println("Enter Name:");
            sc.nextLine(); // clear buffer
            String name = sc.nextLine();
            students[i].setName(name);

            System.out.println("Enter Marks in 3 Subjects:");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            students[i].setMarks(m1, m2, m3);
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Roll No : " + students[i].getRollNo());
            System.out.println("Name    : " + students[i].getName());
            System.out.println("Total   : " + students[i].getTotal());
            System.out.println("Average : " + students[i].getAverage());
            System.out.println("--------------------------");
        }

    }
}
