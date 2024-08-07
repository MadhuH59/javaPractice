package array;

import java.util.HashMap;

public class containsDuplicate 
{

    static void duplicateval(int[] nums){

        for (int i = 0; i < nums.length-1; i++) {

            for (int j = i+1; j < nums.length; j++) {

                if(nums[i]==nums[j]){

                    System.out.println("duplicate value is "+nums[i]);
                }
                
            }
            
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,2,1};

        duplicateval(nums);
    }


    
    
}
    

    


