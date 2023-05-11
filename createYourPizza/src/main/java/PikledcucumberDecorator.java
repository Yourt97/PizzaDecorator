public class PikledcucumberDecorator extends PizzaDecorator {
    public PikledcucumberDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pikled cucumber";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}
