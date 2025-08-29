class Team{
    String tname;
    int tsize;
    int tid;
    String cname;
    String captain;

    void teamSize(int m){
        if(m==tsize){
            System.out.println("Valid Team");
        }
        else{
            System.out.println("Invalid Team");
        }
    }
    void displayCjerseyN(String f,int n){
        if(f==captain){
            System.out.println("Captain Jersey number is: "+n);
        }
    }
}
class MainClass9{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Team s=new Team();
        s.tname="Portugal";
        s.tsize=11;
        s.tid=8;
        s.cname="Jose M";
        s.captain="C.Ronaldo";

        System.out.println("Team Name: "+s.tname+"\nTeam Size: "+s.tsize+"\nTeam id: "+s.tid+"\nCoach Name: "+s.cname+"\nCaptain: "+s.captain);

        s.teamSize(11);
        s.displayCjerseyN("C.Ronaldo", 7);
        System.out.println("Main Method Ended");
    }
}