public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с карамелью";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.6;
    }
}
