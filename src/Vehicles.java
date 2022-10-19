public abstract class Vehicles {
    public Vehicles(int numcar, double carage, int wheels, String controltype, double gasamin) {
        this.numcar = numcar;
        this.carage = carage;
        this.wheels = wheels;
        this.controltype = controltype;
        this.gasamin = gasamin;
    }

    public int getNumcar() {
        return numcar;
    }

    public void setNumcar(int numcar) {
        this.numcar = numcar;
    }

    public double getCarage() {
        return carage;
    }

    public void setCarage(double carage) {
        this.carage = carage;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getControltype() {
        return controltype;
    }

    public void setControltype(String controltype) {
        this.controltype = controltype;
    }

    public double getGasamin() {
        return gasamin;
    }

    public void setGasamin(double gasamin) {
        this.gasamin = gasamin;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "numcar=" + numcar +
                ", carage=" + carage +
                ", wheels=" + wheels +
                ", controltype='" + controltype + '\'' +
                ", gasamin=" + gasamin +
                '}';
    }

    protected int numcar;
    protected double carage;
    protected int wheels;
    protected String controltype;
    protected double gasamin;

    public double exhaust(){
        return this.gasamin*60;
    }

}
