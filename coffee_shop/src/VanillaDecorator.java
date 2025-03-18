public class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с ванилью";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.5;
    }
}
