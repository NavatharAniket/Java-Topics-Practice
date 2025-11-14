import java.util.Scanner;

class Product {
    int productId;
    String name;
    double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Method to calculate final price (overridden)
    public double getFinalPrice() {
        return price;
    }

    public double getPrice() {
        return price;
    }
}

class DiscountedProduct extends Product {
    double discountPercent;

    public DiscountedProduct(int productId, String name, double price, double discountPercent) {
        super(productId, name, price); // using super
        this.discountPercent = discountPercent;
    }

    // Method override: calculate final price after discount
    @Override
    public double getFinalPrice() {
        return price - (price * discountPercent / 100);
    }

    public double getDiscountAmount() {
        return price * discountPercent / 100;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId +
               ", Name: " + name +
               ", Price: " + price +
               ", Discount: " + discountPercent + "%" +
               ", Final Price: " + getFinalPrice();
    }
}

public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscountedProduct[] products = new DiscountedProduct[6];

        // Input 6 products
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // consume newline
            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Discount Percent: ");
            double discount = sc.nextDouble();

            products[i] = new DiscountedProduct(id, name, price, discount);
        }

        // Display products with final price > 5000
        System.out.println("\n--- Products with Final Price > 5000 ---");
        for (DiscountedProduct p : products) {
            if (p.getFinalPrice() > 5000) {
                System.out.println(p);
            }
        }

        // Manual sorting by discount amount in descending order
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].getDiscountAmount() < products[j].getDiscountAmount()) {
                    // Swap
                    DiscountedProduct temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        // Display all products after sorting
        System.out.println("\n--- All Products Sorted by Discount Amount(Descending) ---");
        for (DiscountedProduct p : products) {
            System.out.println(p);
        }

        sc.close();
    }
}
