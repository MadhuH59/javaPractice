package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates { // use cycle sorting method : missing number algorithem

    static List AllDuplicate(int []nums){

        int i=0;

        while(i<nums.length){

            int correct_index=nums[i]-1; // here the values are started from 0 i should have taken as correct_index=nums[i];

            if(nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }
            else{
                i++;
            }
        }

        List<Integer> ll= new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {

            if(nums[index]!=index+1){

                ll.add(nums[index]);
            }
            
        }
        return ll;
    }

    static void swap(int[] nums,int start, int second){

        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }


    public static void main(String[] args) {
        
        int[] nums={4,3,2,7,5,3,1};

        List<Integer>ans= AllDuplicate(nums);

        System.out.println(ans);
    }
    
}
