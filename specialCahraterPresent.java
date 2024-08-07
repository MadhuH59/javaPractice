package stringpractice;

public class specialCahraterPresent {

    static void checkspecialChar(String str){

        for (int i = 0; i < str.length(); i++) {
            
        

            if(!Character.isDigit(str.charAt(i))&!Character.isAlphabetic(str.charAt(i))&!Character.isWhitespace(str.charAt(i))){

                System.out.println("special character is "+str.charAt(i));


            }

            else{System.out.println("no value found" +str.charAt(i));}
        }    


        
            
        
    }
    

    public static void main(String[] args) {


        String name="M@dhu@*#";

        checkspecialChar(name);
        System.out.println(name);

    }
}
