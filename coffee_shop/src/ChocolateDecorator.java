public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с шоколадом";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.7;
    }
}
