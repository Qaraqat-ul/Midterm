import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        
        System.out.print("Введите баланс: ");
        double balance = scanner.nextDouble();
        
        System.out.print("Введите сумму платежа: ");
        double amount = scanner.nextDouble();
        
        System.out.println("Выберите метод оплаты: 1-VISA, 2-MASTERCARD, 3-AMEX, 4-PAYPAL, 5-APPLE_PAY, 6-GOOGLE_PAY");
        int choice = scanner.nextInt();
        PaymentMethod method = PaymentMethod.values()[choice - 1];
        
        Transaction.processPayment(name, balance, amount, method);
    }
}
