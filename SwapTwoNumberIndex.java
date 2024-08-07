package array;

import java.util.Arrays;

public class SwapTwoNumberIndex {

   
    public static void main(String[] args){

        int[] arr= new int[]{1,2,3,4,5,6};

        swap(arr,1,3);  // calling swap methos and passing array and index numbers 1 and 3 so the swap perform between 1 and 3 index

        System.out.println(Arrays.toString(arr));

        

       
    }
    static void swap(int[] arr, int index1, int index2){  // performing swalp operation with the help of creating swap method and passing arr indx1,indx2 
        int temp=arr[index1];                   // so that u can swap particular postions in array
        arr[index1]=arr[index2];
        arr[index2]=temp;



    }
}
