public class Heavy extends Vehicles {
    public Heavy(int numcar, double carage, int wheels, String controltype, double gasamin, int nigrarim) {
        super(numcar, carage, wheels, controltype, gasamin);
        this.nigrarim = nigrarim;
    }

    public int getNigrarim() {
        return nigrarim;
    }

    public void setNigrarim(int nigrarim) {
        this.nigrarim = nigrarim;
    }

    private int nigrarim;

    @Override
    public String toString() {
        return "Heavy{" +
                "nigrarim=" + nigrarim +
                '}';
    }
}
