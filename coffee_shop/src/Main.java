public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = CoffeeFactory.createCoffee("mocha", Size.MEDIUM);
        coffee1 = new ChocolateDecorator(coffee1);
        coffee1 = new MilkDecorator(coffee1);
        System.out.println(coffee1.getDescription() + " | Цена: $" + coffee1.getCost());

        Coffee coffee2 = CoffeeFactory.createCoffee("americano", Size.SMALL);
        coffee2 = new VanillaDecorator(coffee2);
        System.out.println(coffee2.getDescription() + " | Цена: $" + coffee2.getCost());
    }
}
