package array.BinarySearch;

import java.lang.reflect.Array;

import java.util.*;
public class firstandlastindexval {

    public int[] searchRange(int[] nums, int target) {
    
        int[] ans={-1,-1};
    
        int start=search(nums,target,true);
        int end=search(nums,target,false);
    
        ans[0]=start;
        ans[1]=end;
    
        return ans;   
    }
    
        public int search(int[] nums,int target, boolean findfirstindex){
    
            int start=0;
            int end=nums.length-1;
            int ans=-1;
    
            while(start<=end){
    
                int mid=start+(end-start)/2;
    
                if(target<nums[mid]){
                    end=mid-1;
    
                }
                else if(target>nums[mid]){
                    start=mid+1;
                }
                else{
                    ans=mid;
    
                    if(findfirstindex){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    

    public static void main(String[] args) {
        
        int nums[]={5,7,7,8,8,8,1,8,8,10};
        
        firstandlastindexval obj=new firstandlastindexval();
        int target=8;

        int[] result=obj.searchRange(nums,target);

        System.out.println("target first and last position found at  "+Arrays.toString(result));
    }    
    
}
