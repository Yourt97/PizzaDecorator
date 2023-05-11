public class BlackOlivesDecorator extends PizzaDecorator {
    public BlackOlivesDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Black olives";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
