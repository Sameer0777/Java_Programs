class GPSLocation{

    double latitude;
    double longitude;
    String direction;
}
class MainClass4{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        GPSLocation l=new GPSLocation();

        l.latitude=22;
        l.longitude=45;
        l.direction="NORTH";

        System.out.println("Latitude:"+l.latitude+"\nlongitude:"+l.longitude+"\nDirecction:"+l.direction);

        System.out.println("Main Method Ended");
    }
    
}