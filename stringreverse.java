package stringpractice;

public class stringreverse {

    
    
    

    public static void main(String[] args) {
        
        String str="aab";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){

            reverse=reverse+str.charAt(i);
        }
        // using foreach
       System.out.println(reverse);
       if(str.equals(reverse)){
           System.out.println("string is palin");


       }
       else{System.out.println("string is not palin");}

    }

}
