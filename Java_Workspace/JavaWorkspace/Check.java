class Check{
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
    public static void main(String[] args) {
        int n=9,num1=0,num2=0,diff1=0,diff2=0;
        for(int i=n;;i++){
            if(isPrime(i)){
                diff1=i-n;
                num1=i;
                break;
            }
        }
        for(int j=n;;j--){
            if(isPrime(j)){
                diff2=n-j;
                num2=j;
                break;

            }
        }
        if(diff1>diff2){
            System.out.println("nearest prime number is: "+num1);
        }
        else{
            System.out.println("nearest prime number is: "+num2);
        }

    
        
    }
}