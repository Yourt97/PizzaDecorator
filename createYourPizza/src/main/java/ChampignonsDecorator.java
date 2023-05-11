public class ChampignonsDecorator extends PizzaDecorator {
    public ChampignonsDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Champignons";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
