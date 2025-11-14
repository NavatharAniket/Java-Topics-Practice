import java.util.Scanner;
import java.util.Arrays;

class Person {
    String name;
    int age;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Student extends Person {
    int[] marks = new int[5];

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 5.0;
    }

    public boolean hasFailed() {
        for (int mark : marks) {
            if (mark < 40) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Age: " + age +
               ", Marks: " + Arrays.toString(marks) +
               ", Average: " + getAverage();
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // Input for 5 students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.println("Enter Name:");
            String name = sc.nextLine();
            students[i].setName(name);

            System.out.println("Enter Age:");
            int age = sc.nextInt();
            students[i].setAge(age);

            int[] marks = new int[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            students[i].setMarks(marks);

            sc.nextLine(); // consume newline
        }

        // Display all students
        System.out.println("\n--- All Student Details ---");
        for (Student s : students) {
            System.out.println(s);
        }

        // Find topper(s)
        double maxAvg = 0;
        for (Student s : students) {
            double avg = s.getAverage();
            if (avg > maxAvg) {
                maxAvg = avg;
            }
        }

        System.out.println("\n--- Topper(s) ---");
        for (Student s : students) {
            if (s.getAverage() == maxAvg) {
                System.out.println(s);
            }
        }

        // Find students who failed
        System.out.println("\n--- Students Who Failed ---");
        for (Student s : students) {
            if (s.hasFailed()) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
