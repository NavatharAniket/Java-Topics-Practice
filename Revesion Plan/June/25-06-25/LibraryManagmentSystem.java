import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;

    public void setBookId(int id) {
        this.bookId = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsIssued(boolean issued) {
        this.isIssued = issued;
    }

    public boolean getIsIssued() {
        return isIssued;
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[4];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();

            System.out.println("Enter Book ID:");
            int id = sc.nextInt();
            books[i].setBookId(id);

            System.out.println("Enter Title:");
            sc.nextLine(); // Clear buffer
            String title = sc.nextLine();
            books[i].setTitle(title);

            System.out.println("Enter Author:");
            String author = sc.nextLine();
            books[i].setAuthor(author);

            System.out.println("Is the book issued? (true/false):");
            boolean issued = sc.nextBoolean();
            books[i].setIsIssued(issued);
        }

        int issuedCount = 0;
        int availableCount = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsIssued()) {
                issuedCount++;
            } else {
                availableCount++;
            }
        }

        System.out.println("\nIssued Books   : " + issuedCount);
        System.out.println("Available Books: " + availableCount);

    }
}
