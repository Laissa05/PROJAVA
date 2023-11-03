public class Sinter {
    double p;
    double r;
    int y;
    public Sinter(double principal,double rate,int year){
        this.p =principal;
        this.r =rate;
        this.y =year;
    }
    public double calculate(){
        double simpleInterest=(p*r*y)/100;
        return simpleInterest;
    }
    public static void main(String args[]){
        Sinter BobAccount= new Sinter(100000,5,5);
        double simpleInterest= BobAccount.calculate();
        System.out.println("simpleInterst for Mr.Bob:"+simpleInterest);
    
        
    }
    
}
