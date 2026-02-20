/*  Bank Account System – Create Customer and BankAccount classes. Use default/parameterized
   constructors, allow deposits/withdrawals
  through Customer, and track total accounts with a static variable.

 */


class BankAccount1 {
    private String name; // instance
    private double balance; // instance
    private static double totalAmount = 0; // static variable to track total balance

    // Default constructor
    BankAccount1() {
        this.name = "Aslam";
        this.balance = 100;
        totalAmount += this.balance;
    }

    // Parameterized constructor
    BankAccount1(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalAmount += balance;
    }

    // Deposit method
    void deposit(double value) {
        balance += value;
        totalAmount += value;
    }

    // Withdraw method
    void withdraw(double value) {
        if (value <= balance) {
            balance -= value;
            totalAmount -= value;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static double getTotalAmount() {
        return totalAmount;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

class Customer {
    private String name;
    private String C_id;
    private BankAccount1 account1;

    // Default constructor
    Customer() {
        this.name = "Jeed";
        this.C_id = "31";
        this.account1 = new BankAccount1(); // initialize account
    }

    // Parameterized constructor
    Customer(String name, String C_id, double initialBalance) {
        this.name = name;
        this.C_id = C_id;
        this.account1 = new BankAccount1(name, initialBalance);
    }

    void withdraw(double amount) {
        account1.withdraw(amount);
    }

    void deposit(double amount) {
        account1.deposit(amount);
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + C_id);
        account1.display();
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Customer customer1 = new Customer(); // default customer
        customer1.deposit(20000);
        customer1.withdraw(3000);
        customer1.display();

        Customer customer2 = new Customer("Aslam", "1001", 5000); // parameterized customer
        customer2.deposit(2000);
        customer2.withdraw(1000);
        customer2.display();

        System.out.println("Total amount in bank: " + BankAccount1.getTotalAmount());
    }
}