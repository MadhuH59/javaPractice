package selection_sort;

import java.util.Arrays;

public class selectsort {

    static void selectionsort(int[] nums){

        for (int i = 0; i < nums.length; i++) 
        {
            int last=nums.length-i-1;

            int maxval=maxIndex(nums, 0, last);
            swap(nums, maxval, last);
            
            
        }
        
        
        
        
    }
    
    static int maxIndex(int[] nums, int start, int end)
    {

        int maxindx=0;

        for (int i = start; i < end; i++) {

            if(nums[i]>nums[maxindx]){
                maxindx=i;
            }
        }

        return maxindx;


    }

    static void swap(int[] nums, int first, int second){

        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }


    public static void main(String[] args) {
        
        int[] nums={9, 1, 8, 3, 7, 1};

        System.out.println(" selection  sort  "+ Arrays.toString(nums));
        selectionsort(nums);
        System.out.println(" selection  sort  "+ Arrays.toString(nums));



    }
    
}
