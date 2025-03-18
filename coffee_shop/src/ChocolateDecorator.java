public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с шоколадом";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.7; // Доплата за шоколад
    }
}
