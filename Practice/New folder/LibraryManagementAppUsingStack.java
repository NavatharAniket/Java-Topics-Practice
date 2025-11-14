import java.util.*;

class Book {
    private int id;
    private String name;
    private String author;
    private int price;
    private float version;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public float getVersion() { return version; }
    public void setVersion(float version) { this.version = version; }

    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author +
               ", price=" + price + ", version=" + version + "]";
    }
}

public class LibraryManagementAppUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();  // Raw type (no generics)

        while (true) {
            System.out.println("\n========== Library Menu ==========");
            System.out.println("1: Add new book");
            System.out.println("2: Arrange books by version (latest version on top)");
            System.out.println("3: Search book by author or version");
            System.out.println("4: Delete book by version and name");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    Book b = new Book();
                    System.out.print("Enter book ID: ");
                    b.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter book name: ");
                    b.setName(sc.nextLine());
                    System.out.print("Enter author: ");
                    b.setAuthor(sc.nextLine());
                    System.out.print("Enter price: ");
                    b.setPrice(sc.nextInt());
                    System.out.print("Enter version: ");
                    b.setVersion(sc.nextFloat());

                    st.push(b);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    ArrayList al = new ArrayList(st);
                    for (int i = 0; i < al.size(); i++) {
                        Book b1 = (Book) al.get(i);
                        for (int j = i + 1; j < al.size(); j++) {
                            Book b2 = (Book) al.get(j);
                            if (b1.getVersion() < b2.getVersion()) {
                                al.set(i, b2);
                                al.set(j, b1);
                                b1 = b2;
                            }
                        }
                    }
                    st.clear();
                    for (int i = 0; i < al.size(); i++) {
                        st.push(al.get(i));
                    }

                    System.out.println("Books arranged by latest version:");
                    for (int i = 0; i < st.size(); i++) {
                        System.out.println(st.get(i));
                    }
                    break;

                case 3:
                    System.out.println("1: Search by author");
                    System.out.println("2: Search by version");
                    System.out.print("Enter your choice: ");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    if (searchChoice == 1) {
                        System.out.print("Enter author name: ");
                        String searchAuthor = sc.nextLine();
                        for (int i = 0; i < st.size(); i++) {
                            Book book = (Book) st.get(i);
                            if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                                System.out.println(book);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("No books found by author: " + searchAuthor);
                        }

                    } else if (searchChoice == 2) {
                        System.out.print("Enter version to search: ");
                        float searchVersion = sc.nextFloat();
                        for (int i = 0; i < st.size(); i++) {
                            Book book = (Book) st.get(i);
                            if (book.getVersion() == searchVersion) {
                                System.out.println(book);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("No books found with version: " + searchVersion);
                        }

                    } else {
                        System.out.println("Invalid search choice.");
                    }
                    break;

                case 4:
                    if (st.isEmpty()) {
                        System.out.println("Stack is empty. Nothing to delete.");
                    } else {
                        Stack tempStack = new Stack();
                        System.out.print("Enter version to delete: ");
                        float delVersion = sc.nextFloat();
                        sc.nextLine();
                        System.out.print("Enter book name to delete: ");
                        String delName = sc.nextLine();

                        boolean deleted = false;

                        while (!st.isEmpty()) {
                            Book book = (Book) st.pop();
                            if (!deleted && book.getVersion() == delVersion &&
                                book.getName().equalsIgnoreCase(delName)) {
                                System.out.println("Deleted book: " + book);
                                deleted = true;
                            } else {
                                tempStack.push(book);
                            }
                        }

                        while (!tempStack.isEmpty()) {
                            st.push(tempStack.pop());
                        }

                        if (!deleted) {
                            System.out.println("No matching book found to delete.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
