/*
Example: WAP to create POJO class name as book with field id,name and version and sort data of book using a following field case 1: id and case 2: version 

*/

import java.util.*;

class Book {
    private int id;
    private String name;
    private int version;

    public Book(int id, String name, int version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

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

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }
}

// Comparator for sorting by ID (no generics)
class SortProductById implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Book p1 = (Book) obj1;
        Book p2 = (Book) obj2;

        if (p1.getId() > p2.getId())
            return 1;
        else if (p1.getId() < p2.getId())
            return -1;
        else
            return 0;
    }
}

// Comparator for sorting by Version (no generics)
class SortProductByVersion implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Book p1 = (Book) obj1;
        Book p2 = (Book) obj2;

        if (p1.getVersion() > p2.getVersion())
            return 1;
        else if (p1.getVersion() < p2.getVersion())
            return -1;
        else
            return 0;
    }
}

public class Q1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); // No generics used
        al.add(new Book(1, "ABC", 100));
        al.add(new Book(3, "MNO", 10));
        al.add(new Book(2, "XYZ", 1100));
        al.add(new Book(4, "DEF", 500));
        al.add(new Book(5, "LMN", 600));

        System.out.println("Display Book data without sorting:");
        for (Object obj : al) {
            Book b = (Book)obj;
            System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getVersion());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (1 = sort by ID, 2 = sort by Version):");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(al, new SortProductById());
                break;
            case 2:
                Collections.sort(al, new SortProductByVersion());
                break;
            default:
                System.out.println("Wrong choice.");
                return;
        }

        System.out.println("Display Book data after sorting:");
         for (Object obj : al) {
            Book b = (Book)obj;
            System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getVersion());
        }
        //for (int i = 0; i < al.size(); i++) {
        //    Book b = (Book) al.get(i);
        //    System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getVersion());
        //}
    }
}