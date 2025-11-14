import java.util.*;

class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[10];
        ArrayList<Product> list = new ArrayList<>();

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product ID:");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.println("Enter product Name:");
            String name = sc.nextLine();

            System.out.println("Enter product Price:");
            int price = sc.nextInt();

            products[i] = new Product(id, name, price);
            list.add(products[i]);
        }

        // Count frequency of products having same price
        HashMap<Integer, Integer> priceCount = new HashMap<>();

        for (Product p : list) {
            int price = p.getPrice();
            priceCount.put(price, priceCount.getOrDefault(price, 0) + 1);
        }

        System.out.println("\nOccurrences of Product Prices:");
        for (Map.Entry<Integer, Integer> entry : priceCount.entrySet()) {
            System.out.println("Price: " + entry.getKey() + " -> Occurrence: " + entry.getValue());
        }
    }
}
