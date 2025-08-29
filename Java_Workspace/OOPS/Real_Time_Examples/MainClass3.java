class GraphPoint{
    double X_axis;
    double Y_axis;
}
class MainClass3{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        GraphPoint g1=new GraphPoint();

        g1.X_axis=25;
        g1.Y_axis=17.5;

        System.out.println("X-axis:"+g1.X_axis+"\nY-axis:"+g1.Y_axis);

        System.out.println("Main Method Ended");


    }
}