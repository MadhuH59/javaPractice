package array;

import java.util.Arrays;


public class arraydemo {

    public static void main(String[] args) {
        
    

        int[] arr={6,81,2,1,5,6,1,0,7,8};
        System.out.println("actual array is"+Arrays.toString(arr));

        int[] subarr=Arrays.copyOf(arr, 4); // creating sub array using Copy of() method;
        int[] subarr2=Arrays.copyOfRange(subarr, 2, 6); // creating sub array using Copy of() method;
        Arrays.sort(arr); // sorting array using Arrays.sort() method
        int secondmax=arr[arr.length-2]; // after sorting taking the last 2nd value i.e second value
        System.out.println("second max value is"+secondmax);


        System.out.println("after sort is"+Arrays.toString(arr));

        int start=0;
        int end=arr.length-1;
        while(start<end){

            int temp=arr[start];
            arr[start]=arr[end];  // reversing the array
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reverse is"+Arrays.toString(arr));



     
        System.out.println(Arrays.toString(arr));
        
        System.out.println(Arrays.toString(subarr));
        System.out.println(Arrays.toString(subarr2));
        System.out.println(subarr.length);
    
    }
}
