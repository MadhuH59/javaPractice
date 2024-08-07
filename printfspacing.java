import java.util.Scanner;

public class printfspacing {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next(); // nextLine() it goes next line after input, next() after takinf input it will be in the same line
                int x=sc.nextInt();
                // sc.nextLine();  after taking input it goes next line
                System.out.printf("%-15s%03d\n",s1,x); /*First s1 which is formatted using %-15s. The % means that what follows is an argument that will be formatted.
                 Then follows a - resulting in left alignment. 15 fills the string up to a length of 15 characters (adding spaces at the end). Finally the s means, 
                 that you are formatting a string.Second x which is formatted using %03d. Here the 0 is the fill character, meaning that, if necessary, zeros are added. 
                 The 3 is again the width, meaning the fill character 0 is added as many times as necessary to make it 3 digits long (this time at the beginning).
                  Finally d means, that a integer is formatted. */
            }
            System.out.println("================================");

    }
}