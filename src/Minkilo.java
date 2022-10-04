public class Minkilo extends Truck{
    private double minkilos;

    @Override
    public String toString() {
        return "Minkilo{" +
                "minkilos=" + minkilos +
                '}';
    }

    public double getMinkilos() {
        return minkilos;
    }

    public void setMinkilos(double minkilos) {
        this.minkilos = minkilos;
    }

    public Minkilo(int numcar, double carage, int wheels, String controltype, double gasamin, int nigrarim, double kilo, double minkilos) {
        super(numcar, carage, wheels, controltype, gasamin, nigrarim, kilo);
        this.minkilos = minkilos;
    }
}
