public class SR {
    public static void main(String[] args) {
        char grade='A';
        switch(grade)
        {
            case 'A': System.out.println("excellent");
            break;

            case 'B': System.out.println("good");
            break;

            case 'C': System.out.println("average");
            break;

            case 'D': System.out.println("pass");
            break;

            case 'E': System.out.println("fail");
            break;

            default: System.out.println("invalid grade");
        }
    }
    
}
