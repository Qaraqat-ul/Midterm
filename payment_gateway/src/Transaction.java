public class Transaction {
    public static void processPayment(String name, double balance, double amount, PaymentMethod method) {
        if (!PaymentValidator.validateAmount(balance, amount)) {
            System.out.println("Ошибка: Недостаточно средств.");
            return;
        }

        balance -= amount; 

        System.out.println("Транзакция успешно выполнена!");
        System.out.println("Имя: " + name);
        System.out.println("Метод оплаты: " + method);
        System.out.println("Списанная сумма: $" + amount);
        System.out.println("Остаток на балансе: $" + balance);
    }
}
