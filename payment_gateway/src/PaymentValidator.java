public class PaymentValidator {
    public static boolean validateCard(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }
    public static boolean validateAmount(double balance, double amount) {
        return balance >= amount;
    }
}