import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class eof {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i=1;
        while(s.hasNext())
        {
            System.out.println(i+" "+s.nextLine());
            i++;
        }
        
    }
}


