import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;

    // Getter and Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Getter and Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Getter and Setter for Marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    // Natural ordering by name
    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    // Display student information
    @Override
    public String toString() {
        return id + "\t" + name + "\t" + marks;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Creating students using setters
        Student s1 = new Student();
        s1.setId(3);
        s1.setName("Alice");
        s1.setMarks(85);

        Student s2 = new Student();
        s2.setId(1);
        s2.setName("Bob");
        s2.setMarks(90);

        Student s3 = new Student();
        s3.setId(5);
        s3.setName("Charlie");
        s3.setMarks(78);

        Student s4 = new Student();
        s4.setId(4);
        s4.setName("David");
        s4.setMarks(92);

        Student s5 = new Student();
        s5.setId(2);
        s5.setName("Eve");
        s5.setMarks(88);

        // Add students to the list
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Scanner sc = new Scanner(System.in);

        // User menu
        System.out.println("Choose sorting option:");
        System.out.println("1. Sort by ID (Ascending)");
        System.out.println("2. Sort by ID (Descending)");
        System.out.println("3. Sort by Name (Ascending)");
        System.out.println("4. Sort by Name (Descending)");
        System.out.println("5. Sort by Marks (Ascending)");
        System.out.println("6. Sort by Marks (Descending)");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        // Sorting logic using switch
        switch (choice) {
            case 1:
                students.sort(Comparator.comparing(Student::getId));
                break;

            case 2:
                students.sort(Comparator.comparing(Student::getId).reversed());
                break;

            case 3:
                Collections.sort(students); // Uses compareTo -> name ascending
                break;

            case 4:
                students.sort(Comparator.comparing(Student::getName).reversed());
                break;

            case 5:
                students.sort(Comparator.comparing(Student::getMarks));
                break;

            case 6:
                students.sort(Comparator.comparing(Student::getMarks).reversed());
                break;

            default:
                System.out.println("Invalid choice. Showing unsorted list.");
        }

        // Display result
        System.out.println("\nStudent Data:");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}
