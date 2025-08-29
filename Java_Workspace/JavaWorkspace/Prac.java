public class Prac {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        int e=a++ + ++b + ++c - --d + ++d + c + ++d - ++a;

        System.out.println((a>b && c>=d)&&(e>=d && d<a));
        System.out.println(!(a>=b && c+10>=d) || (e/2<d || d*2>c));
        System.out.println(e);
        a+=10;
        b*=2;
        c*=10;
        d+=10;
        d=a+c;
        c=d-1;
       e=a++ + ++b + ++c - --d + ++d + c + ++d - ++a;
        System.out.println(e);
        System.out.println((a>b && c>=d) && (e>=d && d<a));
        System.out.println(!((a>=b && c+10>=d) || (e/2<d || d*2>c)));
        System.out.println(a+" "+b+" "+c+" "+d);


    }
    
}
