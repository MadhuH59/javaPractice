import java.util.Arrays;

public class reversenumberSim {

    static void reverse(int[] nums){

        int start=0;
        int end=nums.length-1;

        while(start<end){

            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        
        int[] nums={1,2,3,4,5,6,7,8,9};
        reverse(nums);
        //System.out.println(Arrays.toString(nums));
    }
    
}
