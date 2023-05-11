public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
