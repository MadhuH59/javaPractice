public class prime
{
    public static void main(String[] args)
    {
        int n=17;
        boolean isprime=true;

        for (int i = 2; i < Math.sqrt(n); i++) {

            if(n%i==0){

                isprime=false;

                System.out.println(n+ " is not prime noumber");
                break;
            }
            
        }
        if(isprime){

            System.out.println(n+" prime number");
        }
        
    }
}