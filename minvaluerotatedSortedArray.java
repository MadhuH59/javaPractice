package array.BinarySearch;

public class minvaluerotatedSortedArray {


    static int minval(int[] nums){

        int start=0;
        int end=nums.length-1;

        while(start<end){

            int mid=start+(end-start)/2;

            if(nums[mid]>nums[end]){

                start=mid+1;

            }else{
                end=mid;            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        
        int[] nums={2,3,6,7,0,2,4};

        int result=minval(nums);

        System.out.println(result);
    }

    
}
