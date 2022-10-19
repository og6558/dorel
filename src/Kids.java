public class Kids extends Regular{
    protected int children;

    @Override
    public String toString() {
        return "Kids{" +
                "children=" + children +
                '}';
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public Kids(int numcar, double carage, int wheels, String controltype, double gasamin, int passangers, int children) {
        super(numcar, carage, wheels, controltype, gasamin, passangers);
        this.children = children;
    }
}
