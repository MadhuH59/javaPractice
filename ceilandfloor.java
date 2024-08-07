package array.BinarySearch;

public class ceilandfloor {

    static int ceilval(int[] nums,int target){

        int start=0;
        int end=nums.length-1;

        while(start<end){

            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return nums[mid];
            }
        }
        return nums[start];
        
    }

    static int floorval(int[] nums,int target){

        int start=0;
        int end=nums.length-1;

        while(start<end){

            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else
            {
                return nums[mid];
            }
        }
        return nums[end];
    }

    public static void main(String[] args) {
        
        int[] nums={1,5,8,10,13,16,22,28};

        int target=8;

        int ceil_result=ceilval(nums, target);
        System.out.println("the ceiling value of "+target+ " is "+ ceil_result);

        int floor_result=floorval(nums, target);
        System.out.println("the flooring value of "+target+ " is "+ floor_result);


    }
    
}
