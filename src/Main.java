public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double mazahamperrachav (Vehicles[] rachavim){
        int i;
        double num = 0;
        for( i = 0; i<rachavim.length;i++ ){
            num = rachavim[i].exhaust() + num;
        }
        return num;
    }
    public static void onnoise(Vehicles[] t){
        for(int i=0; i<t.length;i++){
            if(t[i] instanceof Regular){
                ((Regular) t[i]).noise();
            }
        }
    }
    public static int everybodynodriver(Vehicles[] r){
        int num = 0;
        for(int i=0; i<r.length;i++){
            if(r[i] instanceof Regular){
                num =  ((Regular) r[i]).getPassangers() -1 + num ;
            }
        }
        return num;
    }
    public static int mosttaina(Vehicles[] r){
        double num = 0;
        int place=0;
        for(int i=0; i<r.length;i++){
            if(r[i] instanceof Cart){
                if(((Cart) r[i]).getTimeofcharge() > num){
                    num =  ((Cart) r[i]).getTimeofcharge()  ;
                    place = i;
                }
            }
        }
        return place;
    }
}

