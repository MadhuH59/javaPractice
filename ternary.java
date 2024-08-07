import java.util.*;
public class ternary {
     public static void main(String args[])
    {
     int x =10;
    int y=20;

    int result =0;

    result= x>=y ? x: y; 

    System.out.println(result+ "is the largest value" );
    
    System.out.println("Enter the day to remind your wakeup timings " );
     Scanner scan = new Scanner(System.in);   
    String day =scan.nextLine();
    switch(day){
        case "monday" : System.out.println("Wake up at 7am");
        break;
        case "tuesday" : System.out.println("Wake up at 8am");
        break;
        case "wednesday" : System.out.println("Wake up at 7 30am");
        break;
        case "thursday" : System.out.println("Wake up at 7am");
        break;
        case "friday" : System.out.println("Wake up at 9 am");
        break;
        case "saturday" : System.out.println("Wake up at 10am");
        break;
        case "sunday" : System.out.println("Wake up at 11am");
        break;
        default :
        System.out.println("Enter valid day");
    }
}
}