package CycleSort;

public class MissingNumber {


    static int CyccleMissingNumber(int[] nums){

        int i=0;

        while(i<nums.length){

            int correct_index=nums[i];

            if(nums[i]<nums.length&&nums[i]!=nums[correct_index]){

                swap(nums,i,correct_index);
            }
            else{
                i++;
            }

        }

        for (int index = 0; index <= nums.length-1; index++) {

            if(nums[index]!=index){
                return index;
            }
            
        }
        return nums.length;

    }
    static void swap(int[] nums,int start, int second){

        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }

    
    public static void main(String[] args) {
        
        int[] nums={4,0,2,1};
        int missingnumberval=CyccleMissingNumber(nums);
        System.out.println(missingnumberval);
    }
}
