public class PepperDecorator extends PizzaDecorator {
    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepper";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
