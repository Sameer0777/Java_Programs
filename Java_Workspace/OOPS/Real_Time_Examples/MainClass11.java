class Vehicle{
    String vname;
    int model;
    double price;
    int gear;
    String mode;

    void vehicleStart(){
        if(mode=="ON"){
            System.out.println("Vehicle Started");
        }
        else{
            System.out.println("Vehicle Not Started");
        }
    }

    void shiftGear(){
        if(gear==0){
            System.out.println("Shift Gear to Move");
        }
        else{
            gear++;
            System.out.println("Gear Changed to: "+gear);
        }
    }

}
class MainClass11{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Vehicle v1=new Vehicle();
        v1.vname="GT 650";
        v1.model=2022;
        v1.price=350000.54;
        v1.gear=1;
        v1.mode="ON";

        System.out.println("Vehicle Name: "+v1.vname+"\nModel: "+v1.model+"\nPrice: "+v1.price+"\nGear: "+v1.gear);

        v1.vehicleStart();
        v1.shiftGear();

        System.out.println("Main Method Ended");
    }
    
}