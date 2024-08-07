package CycleSort;

import java.util.Arrays;

public class setMismatch {

    static int[] findErrorNums(int[] nums) {

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

        for(int index=0;index<nums.length;index++){

            if(nums[index]!=index+1){

                return new int[]{nums[index],index+1};
            }
        }

        return new int[]{-1,-1};
        
    }

    static void swap(int[] nums, int first, int second){

        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }


    public static void main(String[] args) {
        

        int[] nums={1,2,2,4};

        int[] setmisval=findErrorNums(nums);

        System.out.println(Arrays.toString(setmisval));
    }
    
}
