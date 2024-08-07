package array;

import java.util.*;
public class rotateArray {

    public void rotate(int[] nums,int k){
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        System.out.println("after first reverse array will be"+Arrays.toString(nums));
        reverse(nums,0,k-1);
        System.out.println("second step reverse the array from 0 to k-1 index then array will be"+Arrays.toString(nums));
        reverse(nums,k,nums.length-1);
        System.out.println("3rd step is to reverse array from idex k to last nums-1 then array will be"+Arrays.toString(nums));
        System.out.println("final output"+Arrays.toString(nums));

    }

   public void reverse(int[] nums, int start, int end){
       while(start<end)
       {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
       }
   }
    public static void main(String[] args) {


        rotateArray ra=new rotateArray();
        int[] nums={1,2,3,4,5,6,7};
        ra.rotate(nums,3);

        
       



    }
    
}
