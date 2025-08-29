class Demo4{

    static int x=10;
           int y=20;
}

class MainClass4{
    public static void main(String[] args) {
        System.out.println(Demo4.x);
            Demo4.x=50;
        System.out.println(Demo4.x);
        System.out.println(new Demo4().y);
            new Demo4().y=70;
        System.out.println(new Demo4().y);
    }

}