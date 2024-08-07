package inteerviewprep;

public class fibbonacci {
    
    static void fibseries(int n){

        int a=0;
        int b=1;
        int sum=1;

        for (int i = 2; i <n ; i++) {

             sum=a+b;

            System.out.println(sum);
            a=b;
            b=sum;
            
        }

    }

    public static void main(String[] args) {
        
        int n=10;
        fibseries(n);
    }
    
}
