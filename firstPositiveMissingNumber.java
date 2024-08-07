package CycleSort;

import java.util.*;

public class firstPositiveMissingNumber {

    static int firstPositvieValue(int[] nums){

        int i=0;

        while(i<nums.length){

            int correct_index=nums[i]-1;

            if(nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }
            else{
                i++;
            }
        }


        for (int index = 0; index < nums.length; index++) {

            if(nums[index]!=index+1){

                return index+1;
            }
            
        }

        return nums.length+1;
    }

    static void swap(int[] nums,int start, int second){

        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }


    
}
