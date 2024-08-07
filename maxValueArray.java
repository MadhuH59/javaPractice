package array;

import java.util.Arrays;

public class maxValueArray {

    
    


    
    public static void main(String[] args) {
        int[] arr=new int[]{33,44,55,1,2,7,77};

        System.out.println("Max value in array is "+max(arr));
        System.out.println("new array"+Arrays.toString(arr));
        System.out.println("max value between array range index 1 to 3 is "+maxRange(arr, 1, 3));
        
    }
    static int max(int[] arr)
    {
         // System.out.println(Arrays.toString(arr));
        int maxVal=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>maxVal){

            maxVal=arr[i];
            }

     
       
        }
        return maxVal;
        

    }  
    // to return max value within range ex: index 2 to index 5
    static int maxRange(int[] arr, int start, int end){
        int maxRangeValue=arr[start];
        for(int j=start;j<=end;j++){
            if(arr[j]>maxRangeValue){
                maxRangeValue=arr[j];
            }
        }
        return maxRangeValue;


    }  
    
}
