package array;

import java.util.Arrays;

public class Plusone {

    static int[] plusone(int[] nums){
        int n=nums.length;

        for (int index = n-1; index >= 0; index--) {

            if(nums[index]<9){
                nums[index]++;
                
                return nums;
            }
            else{nums[index]=0;}
            

            
        }

        int[] nums2=new int[n+1];
        nums2[0]=1;
        return nums2;
    }


    public static void main(String[] args) {
        
        int[] nums={1,9,9};
        int[] val=plusone(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(val));
    }
    
}
