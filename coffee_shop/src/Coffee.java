public abstract class Coffee {
    protected String description;
    protected double price;
    protected Size size;

    public Coffee(String description, double price, Size size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return size + " " + description;
    }

    public double getPrice() {
        return price * size.getMultiplier();
    }
}
