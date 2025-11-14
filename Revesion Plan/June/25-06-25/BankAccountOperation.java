import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for account " + accountNumber);
        }
    }
}

class BankAccountOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] acc = new BankAccount[3];

        for (int i = 0; i < acc.length; i++) {
            acc[i] = new BankAccount();

            System.out.println("Enter Account Number:");
            int num = sc.nextInt();
            acc[i].setAccountNumber(num);

            System.out.println("Enter Account Holder Name:");
            sc.nextLine();  // Consume newline
            String name = sc.nextLine();
            acc[i].setAccountHolderName(name);

            System.out.println("Enter Initial Balance:");
            double balance = sc.nextDouble();
            acc[i].setBalance(balance);

            System.out.println("Enter Deposit Amount:");
            double deposit = sc.nextDouble();
            acc[i].deposit(deposit);

            System.out.println("Enter Withdrawal Amount:");
            double withdraw = sc.nextDouble();
            acc[i].withdraw(withdraw);
        }

        System.out.println("\n--- Final Bank Account Details ---");
        for (int i = 0; i < acc.length; i++) {
            System.out.println("Account No   : " + acc[i].getAccountNumber());
            System.out.println("Holder Name  : " + acc[i].getAccountHolderName());
            System.out.println("Final Balance: " + acc[i].getBalance());
            System.out.println("-------------------------------");
        }
    }
}
