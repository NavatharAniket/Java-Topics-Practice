/*
 3. Custom Functional Interface
Question: How can you define and use a custom functional interface for basic arithmetic operations in Java 8?
Example: Create a Calculator interface with a method like operation(int a, int b) and implement addition and multiplication with lambdas.

*/

import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    void operation(int i, int j);
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        Calculator add = (n, n1) -> System.out.println("Sum: " + (n + n1));
        Calculator multi = (n, n1) -> System.out.println("Product: " + (n * n1));

        add.operation(num, num1);
        multi.operation(num, num1);
    }
}
