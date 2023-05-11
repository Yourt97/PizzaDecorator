public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    public double getCost() {
        return pizza.getCost() + 3.0;
    }

}
