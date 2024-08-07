package practice_most_asked;

public class swap_without_third {

    public static void main(String[] args) {
        

        int x=22;
        int y=33;
        System.out.println( "value of x is "+x+ " value of y is "+y);
    
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println( " after swapping value of x is "+x+ " value of y is "+y);
    }
    
}
