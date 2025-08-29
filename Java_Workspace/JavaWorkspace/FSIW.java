public class FSIW {
    static void si(double p,double r,int t)
    {
        System.out.println("calculation started");
        double res= p*t*r/100;
        System.out.println(res);
        System.out.println("calculation ended");
    }
    public static void main(String[] args) {
        System.out.println("main started");
        si(1200,0.5,2);
        System.out.println("main ended");
    }
    
}
