package array;

import java.util.Arrays;

public class movezero {

    static void zero(int[] nums){


        int start=0;
        

           for (int i = 0; i <= nums.length-1; i++) 
            {

                if(nums[i]!=0)
                {
                    nums[start]=nums[i];
                    start++;
                }
                

                
            }
            while(start<nums.length){
                nums[start++]=0;
                

            }
        System.out.println(Arrays.toString(nums));
            //return start;
    }

    public static void main(String[] args) {

        int[] nums={1,2,0,4,6,8,9,0};
       
        zero(nums);

        //System.out.println(Arrays.toString(nums));
            

       
                
            
       
        


        
    }
    
}
