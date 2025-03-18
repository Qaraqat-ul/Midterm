public class User {
    String name;
    double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean makePayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
