public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с карамелью";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.6; // Доплата за карамель
    }
}
