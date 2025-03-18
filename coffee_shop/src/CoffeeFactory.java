public class CoffeeFactory {
    public static Coffee createCoffee(String type, Size size) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso(size);
            case "latte" -> new Latte(size);
            case "cappuccino" -> new Cappuccino(size);
            case "americano" -> new Americano(size);
            case "mocha" -> new Mocha(size);
            default -> null;
        };
    }
}
