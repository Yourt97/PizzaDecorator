public class OnionDecorator extends PizzaDecorator {
    public OnionDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", onion";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }

}
