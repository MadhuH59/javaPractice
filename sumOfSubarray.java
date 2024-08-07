package array;

import java.util.*;

public class sumOfSubarray {

    static int[] sumsub(int[] nums, int target){

        int sum=0;
       
        for (int i = 0; i <= nums.length-1; i++) {
            sum=nums[i];
            if(sum==target){

                return new int[]{i};
            }
            else{
                for (int j = i+1; j <= nums.length-1; j++) {
                    sum=sum+nums[j];

                    if (sum==target) {

                    return new int[]{i,j};
                    
                    }
                
                }
            }          
        } 
         return new int[]{};
    }

    public static void main(String[] args) {
        
        int[] nums={1, 4, 20, 3, 10, 5};
        int value=38;

        //sumsub(nums, value);

        int []result=sumsub(nums, value);

        System.out.println(Arrays.toString(result));

    }
    
}
