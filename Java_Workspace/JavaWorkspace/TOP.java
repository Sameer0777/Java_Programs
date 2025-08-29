public class TOP {
    public static void main(String[] args) {
        int a=30,b=40,c=50,d=20,e=10;
        int res;
        res=(a>b && a>c && a>d && a>e)?a:(b>c && b>d && b>e)?b:(c>d && c>e)?c:(d>e)?d:e;
        System.out.println(res);
    }
    
}
