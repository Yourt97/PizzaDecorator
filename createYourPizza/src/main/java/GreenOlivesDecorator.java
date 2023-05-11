public class GreenOlivesDecorator extends PizzaDecorator {
    public GreenOlivesDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Green olives";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
