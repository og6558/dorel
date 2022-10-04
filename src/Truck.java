public class Truck extends Heavy{
    private double kilo;

    @Override
    public String toString() {
        return "Truck{" +
                "kilo=" + kilo +
                '}';
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public Truck(int numcar, double carage, int wheels, String controltype, double gasamin, int nigrarim, double kilo) {
        super(numcar, carage, wheels, controltype, gasamin, nigrarim);
        this.kilo = kilo;
    }
}
