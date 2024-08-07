package array;

public class KadensMaxSubarray {

    static int maxsubarrval(int[] nums){

        int curr_max=nums[0];
        int max_so_far=nums[0];

        for (int i = 1; i < nums.length; i++) {

            curr_max=Math.max(nums[i], nums[i]+curr_max);/// 3 1, 5,11,19
            max_so_far=Math.max(curr_max, max_so_far);// 3 +3 ,5,11,19,20
            
        }
        return max_so_far;

    }

    public static void main(String[] args) {
        
        int[] nums={-1,3,-2,5,6,8,1};
        int result=maxsubarrval(nums);
        System.out.println(result);
    }
    
}
