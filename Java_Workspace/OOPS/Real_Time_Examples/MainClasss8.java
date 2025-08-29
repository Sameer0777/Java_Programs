class Library{
    String bname;
    int bid;
    String aname;
    String idate;
    String rdate;
    
    void returnBook(String d){
        if(d==rdate){
            System.out.println("Return Book!!");
        }
        else{
            System.out.println("You Have Time To Return The Book");
        }
    }

    void displayBookissued(){
        System.out.println("Book Name Is: "+bname);
    }
}
class MainClass8{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Library l1=new Library();
        l1.bname="Java";
        l1.bid=1980;
        l1.aname="James Gosling";
        l1.idate="07-APR-2001";
        l1.rdate="23-AUG-2001";
        System.out.println("Book Name: "+l1.bname+"\nBook Id: "+l1.bid+"\nAuthor Name: "+l1.aname+"\nIssue Date: "+l1.idate+"\nReturn Date: "+l1.rdate);

        l1.returnBook("23-AUG-2001");
        l1.displayBookissued();
        
        System.out.println("Main Method Ended");
    }
    
}