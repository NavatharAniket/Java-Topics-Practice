import java.util.Scanner;

// Abstract class
abstract class MatrixOperation {
    public abstract void perform(int[][] matrix);
}

// Sum of both diagonals
class DiagonalSum extends MatrixOperation {
    public void perform(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];           // primary diagonal
            sum += matrix[i][n - 1 - i];   // secondary diagonal
        }
        // If n is odd, middle element added twice, subtract once
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }
        System.out.println("Sum of both diagonals: " + sum);
    }
}

// Print transpose
class Transpose extends MatrixOperation {
    public void perform(int[][] matrix) {
        int n = matrix.length;
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}

// Print max element of each row
class RowMax extends MatrixOperation {
    public void perform(int[][] matrix) {
        int n = matrix.length;
        System.out.println("Maximum element of each row:");
        for (int i = 0; i < n; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }
    }
}

public class MatrixOperationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of n x n matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Array of MatrixOperation references
        MatrixOperation[] operations = new MatrixOperation[3];
        operations[0] = new DiagonalSum();
        operations[1] = new Transpose();
        operations[2] = new RowMax();

        for (int i = 0; i < operations.length; i++) {
            operations[i].perform(matrix);
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}
