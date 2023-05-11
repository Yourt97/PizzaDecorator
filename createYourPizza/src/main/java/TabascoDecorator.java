public class TabascoDecorator extends PizzaDecorator{
    public TabascoDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Tabasco";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}
