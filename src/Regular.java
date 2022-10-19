public abstract class Regular extends Vehicles{
    protected int passangers;

    @Override
    public String toString() {
        return "Regular{" +
                "passangers=" + passangers +
                '}';
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public Regular(int numcar, double carage, int wheels, String controltype, double gasamin, int passangers) {
        super(numcar, carage, wheels, controltype, gasamin);
        this.passangers = passangers;
    }

    @Override
    public double exhaust() {
        return super.exhaust()*this.passangers;
    }
    public void noise(){
        System.out.println("ioioioioioioio");
    }
    public int hitchhikers(){
        return passangers+5;
    }
}
