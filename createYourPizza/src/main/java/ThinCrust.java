public class ThinCrust implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza with thin crust and";
    }
    @Override
    public double getCost() {
        return 10.0;
    }
}