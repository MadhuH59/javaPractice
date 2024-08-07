package CycleSort;


// use cycle sort if the arrays in the range of valkue Input: nums = [1,3,4,2,2]
public class duplicateNumber {


    static int DuplicateValue(int[] nums){  // use syclic sort method

        int i=0;
        while(i<nums.length){

            if(nums[i]!=i+1){ // jist an extra if condition to find duplicate values

                int correct_index=nums[i]-1;  // correct_index= nums[i]-1; because array values stared from 1 so, if the values are started from 0 i should have taken as correct_index=nums[i];

                if(nums[i]!=nums[correct_index]){

                    swap(nums,i,correct_index);
                }else{
                    return nums[i];
                }
            }
            else{
                i++;
            }


        }

        return -1;
    }

    static void swap(int[] nums, int first, int second){

        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }



    public static void main(String[] args) {
        

        int[] nums={1,3,4,2,2};

        int dupval=DuplicateValue(nums);

        System.out.println("Duplicate number is "+dupval);
    }
    
}
