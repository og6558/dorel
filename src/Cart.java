public class Cart extends Light{
    protected double timeofcharge;

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

    @Override
    public double exhaust() {
        return super.exhaust() + timeofcharge;
    }
    public double hitchhikers(){
        return 5.0 * timeofcharge;
    }
}
