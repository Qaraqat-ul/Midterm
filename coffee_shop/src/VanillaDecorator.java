public class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с ванилью";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5; // Доплата за ваниль
    }
}
