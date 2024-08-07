import java.util.*;
import java.util.*;
public class reversestring {

    public static void main(String[] args){

        String name="aba";
        String reverse="";
        // char[] arr=name.toCharArray(); // converting string to arr char
        // int n=arr.length;
        int n=name.length();
        for(int i=n-1;i>=0;i--){
            // reverse=reverse+arr[i];// reverse : convert string to arr then reverse
            reverse=reverse+name.charAt(i);// reverse directly string
        }
        System.out.println(reverse);
        String palin=reverse;

        if(palin.equals(name) ) // use .equals(); method to check compare check two strings
        {
            System.out.println( "given string is palindrome ");
        } else{
            System.out.println("string is not palinddrome");
        }
    }
}
