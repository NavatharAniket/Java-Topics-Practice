import java.util.Scanner;

class Matrix {
    int[][] mat;
    int rows, cols;

    // Constructor 1: Initializes a matrix with rows and cols
    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    // Constructor 2: Accepts a 2D array directly
    Matrix(int[][] arr) {
        this.rows = arr.length;
        this.cols = arr[0].length;
        this.mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                this.mat[i][j] = arr[i][j];
    }

    // Method to accept matrix input
    void input(Scanner sc) {
        System.out.println("Enter matrix elements (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();
    }

    // Method to display matrix
    void display() {
        System.out.println("Matrix:");
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    // Method to add two matrices
    Matrix add(Matrix m) {
        if (this.rows != m.rows || this.cols != m.cols) {
            System.out.println("Addition not possible. Dimensions don't match.");
            return null;
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.mat[i][j] = this.mat[i][j] + m.mat[i][j];
        return result;
    }

    // Method to multiply two matrices
    Matrix multiply(Matrix m) {
        if (this.cols != m.rows) {
            System.out.println("Multiplication not possible. Columns of first != rows of second.");
            return null;
        }
        Matrix result = new Matrix(this.rows, m.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.mat[i][j] += this.mat[i][k] * m.mat[k][j];
                }
            }
        }
        return result;
    }

    // Method to find transpose
    Matrix transpose() {
        Matrix result = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.mat[j][i] = mat[i][j];
        return result;
    }
}

public class MatrixOperationsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Matrix A
        System.out.println("Enter rows and columns of Matrix A:");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        Matrix A = new Matrix(r1, c1);
        A.input(sc);

        // Input Matrix B
        System.out.println("Enter rows and columns of Matrix B:");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        Matrix B = new Matrix(r2, c2);
        B.input(sc);

        // Display matrices
        System.out.println("Matrix A:");
        A.display();
        System.out.println("Matrix B:");
        B.display();

        // Addition
        System.out.println("Matrix Addition:");
        Matrix addResult = A.add(B);
        if (addResult != null) addResult.display();

        // Multiplication
        System.out.println("Matrix Multiplication:");
        Matrix multResult = A.multiply(B);
        if (multResult != null) multResult.display();

        // Transpose of Matrix A
        System.out.println("Transpose of Matrix A:");
        Matrix transA = A.transpose();
        transA.display();

        // Transpose of Matrix B
        System.out.println("Transpose of Matrix B:");
        Matrix transB = B.transpose();
        transB.display();

        sc.close();
    }
}
