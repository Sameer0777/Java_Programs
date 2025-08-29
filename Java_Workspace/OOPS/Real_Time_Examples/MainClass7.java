class ATelevision{
    String brand;
    double price;
    int size;
    int version;

    void updatePrice(double newprice){
        price=newprice;
    }

    void updateVersion(int v){
        if(version==v){
            version++;
        }     
        }
    }

class MainClass7{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        ATelevision t=new ATelevision();
        t.brand="Sony";
        t.price=68000;
        t.size=43;
        t.version=7;
        System.out.println("Brand: "+t.brand+" Price: "+t.price+" Size: "+t.size+" Version: "+t.version);

        t.updatePrice(43000);
        t.updateVersion(7);
        System.out.println("Brand: "+t.brand+" Price: "+t.price+" Size: "+t.size+" Version: "+t.version);

        System.out.println("Main Method Ended");
    }
    
}