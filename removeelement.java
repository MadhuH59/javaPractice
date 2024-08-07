import java.util.Arrays;

public class removeelement {

    public static void main(String[] args) {
        
        int[] arr={1,2,3,3,2,6};
        int val=1;
        int sim=0;

        for(int i=0;i<arr.length-1;i++){

            if(val==arr[i]){

                System.out.println(arr[i]);

                continue;

            }
            sim=arr[i];
            
        }
       
        System.out.println(sim);

        System.out.println(Arrays.toString(arr));
    }
    
}
