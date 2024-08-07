package twoPointera;

import java.util.*;

public class validpalindromeleet {

    static boolean valPalin(String s){

        String reverse="";
        for (char c : s.toCharArray()) { // using for loop and taking s sting to char arr() method for iteration

            if(Character.isDigit(c)||Character.isAlphabetic(c)){

                reverse += c;
            }
        }    
            reverse=reverse.toLowerCase();

            int a_pointer=0;
            int b_pointer=reverse.length()-1;

            while(a_pointer<=b_pointer){

                if(reverse.charAt(a_pointer)!=reverse.charAt(b_pointer)){

                    return false;
                }
                a_pointer+=1;
                b_pointer-=1;
            }
            
            System.out.println(reverse);
        
            return true;
        
        



    }

    public static void main(String[] args) {
        
        String s="A man, a plan, a canal: Panama";

        boolean result=valPalin(s);
        System.out.println(result);
    }
    
}
