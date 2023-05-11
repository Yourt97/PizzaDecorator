public class BasilDecorator extends PizzaDecorator{
    public BasilDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", basil";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
