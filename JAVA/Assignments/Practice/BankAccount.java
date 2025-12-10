public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } 
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1011, "Surya", 5000);

        acc.displayDetails();
        System.out.println("-----------------------");
        
        acc.deposit(1500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        System.out.println("-----------------------");

        acc.withdraw(3000);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

        System.out.println("-----------------------");

        acc.withdraw(5000); 
    }
}
