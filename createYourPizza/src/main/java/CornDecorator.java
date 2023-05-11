public class CornDecorator extends PizzaDecorator {

    public CornDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", corn";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }

}
