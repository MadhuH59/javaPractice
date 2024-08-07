package CycleSort;

import java.util.Arrays;

public class cyclesorting {


    static void CyclicSorting(int[] nums){

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

         
    }
    static void swap(int[] nums,int start, int second){

        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }

    public static void main(String[] args) {
        
        int[] nums={4,3,1,2};

        CyclicSorting(nums);

        System.out.println(Arrays.toString(nums));
    }
   
    
}
