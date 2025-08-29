class Prac5{
   int x;
   {
    x=10;
   }
}
class Main1{
    public static void main(String[] args) {
        Prac5 p1=new Prac5();
        System.out.println(p1.x);
        p1.x=15;
        System.out.println(p1.x);
        p1=new Prac5();
        System.out.println(p1.x);
        Prac5 p2;
        p2=p1;
        p2.x=65;
        System.out.println(p2.x);
        System.out.println(p1.x);
        p2=new Prac5();
        p1=p2;
        System.out.println(p2.x);
        System.out.println(p1.x);

    }
}