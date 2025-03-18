import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Выберите размер: 1 - Маленький, 2 - Средний, 3 - Большой");
        int sizeChoice = scanner.nextInt();
        Size size = switch (sizeChoice) {
            case 1 -> Size.SMALL;
            case 2 -> Size.MEDIUM;
            case 3 -> Size.LARGE;
            default -> {
                System.out.println("Некорректный выбор, установлен средний размер.");
                yield Size.MEDIUM;
            }
        };

        
        scanner.nextLine();
        System.out.println("Выберите тип кофе (espresso, cappuccino, latte, americano, mocha): ");
        String coffeeType = scanner.nextLine().toLowerCase();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType, size);
        if (coffee == null) {
            System.out.println("Ошибка: Такой кофе не найден.");
            return;
        }

        
        System.out.println("Хотите добавить добавки? (да/нет)");
        String addExtras = scanner.nextLine().toLowerCase();
        while (addExtras.equals("да")) {
            System.out.println("Выберите добавку: 1 - Молоко, 2 - Шоколад, 3 - Карамель, 4 - Ваниль");
            int extraChoice = scanner.nextInt();
            coffee = switch (extraChoice) {
                case 1 -> new MilkDecorator(coffee);
                case 2 -> new ChocolateDecorator(coffee);
                case 3 -> new CaramelDecorator(coffee);
                case 4 -> new VanillaDecorator(coffee);
                default -> coffee;
            };

            scanner.nextLine();
            System.out.println("Хотите еще добавку? (да/нет)");
            addExtras = scanner.nextLine().toLowerCase();
        }

        System.out.println("Ваш заказ: " + coffee.getDescription() + " | Цена: $" + String.format("%.2f", coffee.getPrice()));
    }
}
