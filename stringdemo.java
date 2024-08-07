package stringpractice;
import java.util.*;

public class stringdemo {

    public static void main(String[] args) {
        
        String name="madhu";
        String reversename="";

        for(int i=name.length()-1;i>=0;i--){

            reversename=reversename+name.charAt(i);

        }
        System.out.println(reversename);
        if(reversename.equals(name)){ System.out.println("palin");}
        else{System.out.println("not a palin");}

        StringBuilder name2= new StringBuilder("revanth");

        StringBuilder revname=name2.reverse(); // reverse using builtin reverse() method in string builder in java 

        System.out.println(revname);

    }
    
}
