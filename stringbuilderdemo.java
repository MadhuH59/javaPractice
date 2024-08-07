package stringpractice;

public class stringbuilderdemo {

    public static void main(String[] args) {
        
        StringBuilder stb= new StringBuilder("aba");
        
        System.out.println(stb);
        StringBuilder reverse=stb.reverse();
        System.out.println(reverse);

        if(stb.equals(reverse)){

            System.out.println("it is palin");
        }
        else{System.out.println("not a plain");}

        StringBuilder stb2= new StringBuilder("aba");
        stb2.append("maddy");
        System.out.println(stb2);
    }
    
}
