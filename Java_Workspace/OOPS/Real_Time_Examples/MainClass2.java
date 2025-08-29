class Mobile{
    String brand;
    String color;
    double price;
    int ramSize;
    String display;
    double AndroidVersion;
    

    void ChangeDisplay(String newDisplay){
        display=newDisplay;
    }

    void UpdateVersion(double Latestversion){
        AndroidVersion=Latestversion;
    }

    void IncrementPrice(double NewPrice){
        price=NewPrice;
    }
}
class MainClass2{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Mobile m1=new Mobile();

        m1.brand="OnePlus";
        m1.color="Black";
        m1.price=27000.00;
        m1.ramSize=6;
        m1.display="AmoledDisplay";
        m1.AndroidVersion=11.00;

        System.out.println("Brand:"+m1.brand+"\nColor:"+m1.color+"\nPrice"+m1.price+"\nRamSize:"+m1.ramSize+"\nDisplay:"+m1.display+"\nAndroidVersion:"+m1.AndroidVersion);
        System.out.println("Man Method Ended");
    }
}