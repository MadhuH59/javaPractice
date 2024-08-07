package array;

import java.util.Arrays;

public class secondmaxArray {

    static int secondMax(int[] nums){

        int firstmax=0;
        int secondmax=0;

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]>firstmax){
                secondmax=firstmax;
                firstmax=nums[i];
            }
            else if(nums[i]>secondmax){
                secondmax=nums[i];
            }
            
        }
        return secondmax;
    }


    public static void main(String[] args) {
        
        int[] nums={2,1,3,4,9,5,6,7,8};

        Arrays.sort(nums);

        int secondmaxvalue=nums.length-2;
        System.out.println("second max value is"+secondmaxvalue);

        int val=secondMax(nums);
        System.out.println(val);



    }
    
}
