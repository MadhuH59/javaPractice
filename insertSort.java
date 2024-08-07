package insertionSort;

import java.util.Arrays;

public class insertSort {

    static void insertionsorting(int[] nums){

        for (int i = 0; i < nums.length-1; i++) {
            
            for (int j = i+1; j > 0; j--) {

                if(nums[j]<nums[j-1]){

                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;

                }
                else{
                    break;
                }
                
            }
        }
    }


    public static void main(String[] args) {
        

        int[] nums={9, 1, 8, 3, 7, 1};

        System.out.println("Before sorting "+Arrays.toString(nums));

        insertionsorting(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
