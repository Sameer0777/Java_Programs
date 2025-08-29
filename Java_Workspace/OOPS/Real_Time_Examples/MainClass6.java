class TicketCounter{
    int totaltickets;

    void viewTotalTickets(){
        System.out.println("Total Tickets: "+totaltickets);
    }

    void buyTickets(int n){
        System.out.println("Buying "+n+" tickets");
        if(n<totaltickets){
            totaltickets=totaltickets-n;
        }
        else{
            System.out.println("Failed due to sufficient tickets");
        }
    }

    void cancelTickets(int n){
        System.out.println("Cancelling "+n+" tickets");
        totaltickets=totaltickets+n;
    }
}
class MainClass6{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        TicketCounter tc1=new TicketCounter();
        tc1.totaltickets=100;
        tc1.viewTotalTickets();
        tc1.buyTickets(20);
        tc1.viewTotalTickets();
        tc1.cancelTickets(5);
        tc1.viewTotalTickets();

        System.out.println("Main Method Ended");

    }
}