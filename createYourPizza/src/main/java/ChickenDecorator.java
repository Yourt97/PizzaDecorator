public class ChickenDecorator extends PizzaDecorator{
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", chicken";
    }

    public double getCost() {
        return pizza.getCost() + 3.0;
    }
}
