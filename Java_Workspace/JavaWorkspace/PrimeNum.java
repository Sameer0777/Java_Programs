class PrimeNum{
    static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }
    static int k;
    void disp(){
        System.out.println(k);
    }
    public static void main(String[] args) {
        int sum=0,c=0,key=1000;
        for(int i=1;;i++){
            if(isPrime(i)==true){
                sum=sum+i;
                c++;
            }
            if(c==key){
                break;
            }
        }
        System.out.println(sum);
        PrimeNum p=new PrimeNum();
        p.disp();
    }
}