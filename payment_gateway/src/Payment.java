public class Payment {
    public static boolean processPayment(User user, double amount) {
        return user.makePayment(amount);
    }
}
