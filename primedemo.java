public class primedemo
{
    public static void main(String[] args)
    {
        
        for(int i=2;i<100;i++){
            boolean isprime;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime=true){
                System.out.println(i);
            }
        }
    }
}