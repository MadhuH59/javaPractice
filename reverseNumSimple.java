import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseNumSimple {
    public static void main(String[] args) {
        int[] arr2={0,9,8,7,6};

        int start=0;
        int end=arr2.length-1;

        while(start<end){
            int temp2 =arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp2;

            start+=1;
            end-=1;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
