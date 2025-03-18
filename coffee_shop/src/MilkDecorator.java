public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с молоком";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.5;
    }
}
