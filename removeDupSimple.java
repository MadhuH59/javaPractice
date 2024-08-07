import java.util.Arrays;

public class removeDupSimple {

    public static void main(String[] args) {
        
        int[] arr={1,1,3,4,5,6,7,8};
        int start=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[start])
            {
            arr[++start]=arr[i];
            System.out.println(arr[i]);
        }

            
            //System.out.println(arr[start]);
        }
        start=start+1;
        //System.out.println(arr[start]);
               //System.out.print(Arrays.toString(arr));
    }
    
}
