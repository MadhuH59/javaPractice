package array.BinarySearch;

import java.util.Arrays;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
       
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{};      
    }

    public static void main(String[] args) {
        twosum ts=new twosum();

        int[] nums={1,3,5,4,8,2};
        int target=9;

        

        int[] ans=ts.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
        
    

    }
}