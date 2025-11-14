import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double pricePerUnit;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class ProductInventorySystem {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();

            System.out.println("Enter Product ID:");
            int id = sc.nextInt();
            products[i].setProductId(id);

            System.out.println("Enter Product Name:");
            sc.nextLine(); // Clear buffer
            String name = sc.nextLine();
            products[i].setProductName(name);

            System.out.println("Enter Quantity:");
            int quantity = sc.nextInt();
            products[i].setQuantity(quantity);

            System.out.println("Enter Price Per Unit:");
            double price = sc.nextDouble();
            products[i].setPricePerUnit(price);
        }

        System.out.println("\n--- Product Inventory ---");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product ID   : " + products[i].getProductId());
            System.out.println("Name         : " + products[i].getProductName());
            System.out.println("Quantity     : " + products[i].getQuantity());
            System.out.println("Price/Unit   : " + products[i].getPricePerUnit());

            if (products[i].getQuantity() < 5) {
                System.out.println("Status       : Low Stock");
            } else {
                System.out.println("Status       : In Stock");
            }
            System.out.println("------------------------------");
        }

           }
}
