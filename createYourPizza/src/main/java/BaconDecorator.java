public class BaconDecorator extends PizzaDecorator {
    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Becon";
    }

    public double getCost() {
        return pizza.getCost() + 3.0;
    }
}
