package bubblesort;

import java.util.*;
public class bubblesort {

    static void bsort(int[] nums){
        
        boolean swapped=false;

        for (int i = 0; i < nums.length-1; i++) {

            for (int j = 1; j < nums.length-i; j++) {

                if(nums[j]<nums[j-1]){

                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;

                    swapped=true;
                }
                
                
            }
            if(!swapped){
                break;
            }
            
        }
    }

    public static void main(String[] args) {
        
        int[] nums={9, 1, 8, 3, 7, 1};
        System.out.println(Arrays.toString(nums));

        bsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
