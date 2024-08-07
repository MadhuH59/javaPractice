package array;

import java.util.Arrays;

public class reverseNumber {

    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6};

        //System.out.println(Arrays.toString(reverse(arr)));
        reverse(arr); // calling method to perform method action
        System.out.println(Arrays.toString(arr));


        int[] arr2={0,9,8,7,6}; // reverse number without mentioning method

        int start=0;
        int end=arr2.length-1;

        while(start<end){
            int temp2 =arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp2;

            start+=1;
            end-=1;
        }
        System.out.println("printing arr2"+Arrays.toString(arr2));

    }
    static void reverse(int[] arr){

        int start_point=0;
        int end_point=arr.length-1;

        while(start_point<end_point){
            int temp=arr[start_point];
            arr[start_point]=arr[end_point];
            arr[end_point]= temp;

            start_point++;
            end_point--;

            

            
        }
        System.out.println("printing loop result"+Arrays.toString(arr));
        
    }
    
}
