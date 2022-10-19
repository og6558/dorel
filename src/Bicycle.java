public class Bicycle extends Light{
    protected boolean salsala;

    @Override
    public String toString() {
        return "Bicycle{" +
                "salsala=" + salsala +
                '}';
    }

    public boolean isSalsala() {
        return salsala;
    }

    public void setSalsala(boolean salsala) {
        this.salsala = salsala;
    }

    public Bicycle(int numcar, double carage, int wheels, String controltype, double gasamin, boolean engine, boolean salsala) {
        super(numcar, carage, wheels, controltype, gasamin, engine);
        this.salsala = salsala;
    }
}
