public abstract class Light extends Vehicles{
    protected boolean engine;

    @Override
    public String toString() {
        return "Light{" +
                "engine=" + engine +
                '}';
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public Light(int numcar, double carage, int wheels, String controltype, double gasamin, boolean engine) {
        super(numcar, carage, wheels, controltype, gasamin);
        this.engine = engine;
    }
}
