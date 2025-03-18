public abstract class CoffeeDecorator extends Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        super(coffee.getDescription(), coffee.getPrice(), coffee.size);
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}
