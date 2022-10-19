import java.util.Arrays;

public class Kibbutz {
    protected  Vehicles[] Y = new Vehicles[500];
    protected int num;

    public Kibbutz() {
        this.num = 0;

    }

    public Vehicles[] getY() {
        return Y;
    }

    public void setY(Vehicles[] y) {
        Y = y;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Kibbutz{" +
                "Y=" + Arrays.toString(Y) +
                ", num=" + num +
                '}';
    }

    public void carrr(Vehicles cer){
        Y[num] = cer;
        num = num+ 1;
    }

    public Vehicles[] Plus15(){
        Vehicles[] R15 = new Vehicles[500];
        int tt =0, gg = 0;
        for(tt=0;tt<500;tt++){
            if (this.Y[tt].getControltype().equals("hega")){
                if(this.Y[tt].getCarage()==15){
                    R15[gg] = this.Y[tt];
                    gg++;
                }
            }
        }
        return R15;
    }

    public int allcarshega(){
        int carses = 0;
        int dorel = 0;
        for(dorel =0; dorel<500;dorel++){
            if (this.Y[dorel].getControltype().equals("hega")){
                if(this.Y[dorel] instanceof Regular || this.Y[dorel] instanceof Light ){
                    carses++;
                }
            }
        }
        return carses;
    }
}
