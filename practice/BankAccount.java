// 🧩 Question 2: Encapsulation & Getters/Setters

// Create a Java class called BankAccount that follows encapsulation principles.
// It should have:
// A private field balance (double).
// A constructor that sets the initial balance.
// Two public methods:
// deposit(double amount) → adds the amount to balance.
// withdraw(double amount) → subtracts from balance only if there’s enough money, otherwise print "Insufficient balance".
// A getter method getBalance() that returns the current balance.
// In your main method:
// Create an account with ₹5000 initial balance.
// Deposit ₹2000.
// Try to withdraw ₹8000 (should fail).
// Print the final balance.
class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(5000);
        b.deposit(2000);
        b.withdraw(8000);
        System.out.println("Final Balance: " + b.getBalance());
    }
}
