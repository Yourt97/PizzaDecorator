public class AnanasDecorator extends PizzaDecorator {
    public AnanasDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", ananas";
    }

    public double getCost() {
        return pizza.getCost() + 2.5;
    }



}
