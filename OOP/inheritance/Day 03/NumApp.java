import java.util.Scanner;

class Num {
    int num;
    public void setNum(int num) {
        this.num = num;
    }
}

class Rev extends Num {
    public int get() {
        int temp = num;
        int num2 = 0;
        while (temp != 0) {
            int dig = temp % 10;
            temp /= 10;
            num2 = num2 * 10 + dig;
        }
        return num2;
    }
}

class Count extends Num {
    public int getCount() {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
}

class Palin extends Num {
    public boolean get() {
        int temp = num;
        int rev = 0;
        int original = temp;
        while (temp != 0) {
            int dig = temp % 10;
            temp /= 10;
            rev = rev * 10 + dig;
        }
        return rev == original;
    }
}

public class NumApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num n = null;

        while (true) {
            System.out.println("\n1 for Reverse");
            System.out.println("2 for Count");
            System.out.println("3 for Palindrome");
            System.out.println("4 for Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 4) break;

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            switch (ch) {
                case 1:
                    n = new Rev();
                    n.setNum(num);
                    System.out.println("Reversed: " + ((Rev) n).get());
                    break;
                case 2:
                    n = new Count();
                    n.setNum(num);
                    System.out.println("Count of digits: " + ((Count) n).getCount());
                    break;
                case 3:
                    n = new Palin();
                    n.setNum(num);
                    System.out.println("Is Palindrome? " + ((Palin) n).get());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
