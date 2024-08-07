package array;

import java.util.Arrays;

public class removeDuplicate {
    
     static int removeDuplicates(int[] nums) {
        int start=0;
        
        for(int i=0;i<=nums.length-1;i++){
           
                if(nums[start]!=nums[i]){
                    nums[++start]=nums[i];
                    System.out.println(start);

                    
                    

                   
                }
                //System.out.println("printing"+nums[start]);
          
        } return start++;
        
        
    }

    public static void main(String[] args) {
        
        int[] nums={1,1,2,3,4,5,6};
        removeDuplicates(nums);

        System.out.println(Arrays.toString(nums));

    }
}
