public class Cart extends Light{
    private double timeofcharge;

    @Override
    public String toString() {
        return "Cart{" +
                "timeofcharge=" + timeofcharge +
                '}';
    }

    public double getTimeofcharge() {
        return timeofcharge;
    }

    public void setTimeofcharge(double timeofcharge) {
        this.timeofcharge = timeofcharge;
    }

    public Cart(int numcar, double carage, int wheels, String controltype, double gasamin, boolean engine, double timeofcharge) {
        super(numcar, carage, wheels, controltype, gasamin, engine);
        this.timeofcharge = timeofcharge;
    }
}
