package stringpractice;

public class findingvowels {

    static boolean checkvowel(String str){

       

           /* if(str.toLowerCase().matches(".*[aeiou].*")){

                System.out.println("vowel present in "+str);

            } */
            
       

        return str.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        
        String str="Madhu";
        boolean result=checkvowel(str);
        System.out.println(result);



    }
}
