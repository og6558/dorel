public class Tractor extends Heavy{
    protected String whatnigrar;

    @Override
    public String toString() {
        return "Tractor{" +
                "whatnigrar='" + whatnigrar + '\'' +
                '}';
    }

    public String getWhatnigrar() {
        return whatnigrar;
    }

    public void setWhatnigrar(String whatnigrar) {
        this.whatnigrar = whatnigrar;
    }

    public Tractor(int numcar, double carage, int wheels, String controltype, double gasamin, int nigrarim, String whatnigrar) {
        super(numcar, carage, wheels, controltype, gasamin, nigrarim);
        this.whatnigrar = whatnigrar;
    }
}
