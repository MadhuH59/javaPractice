package practice_most_asked;

public class count_divisible_by_value {

    public void diviblebyvalue(int n){

        int count=0;
        int count1=0;
        int count2=0;

        for (int i = 0; i <=n; i++) {

            if (i%3==0) {

                count++;
                
            }
            if (i%5==0) {

                count1++;
                
            }
            if (i%3==0&&i%5==0) {

                count2++;
                
            }
            
        }

        System.out.println( " count number divisible by 3 is " +count);
        System.out.println( " count number divisible by 3 is " +count1);
        System.out.println( " count number divisible by 3 is " +count2);
    }
    

    public static void main(String[] args) {
        

        count_divisible_by_value cv=new count_divisible_by_value();

        int n=50;

        cv.diviblebyvalue(n);

    }
}
