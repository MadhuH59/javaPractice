package array;

import java.util.Arrays;


class removeElement {
    public int removeElement(int[] nums, int val){  // created method
        int n=nums.length;  
        if(n==0) return 0;
        int valid_size =0;  // creating variable to define starting point 0th position of array{valid_size}
       
        for(int i=0;i<n;i++){ //  iterarting to get into array
           
            
            if(nums[i]!=val){ // if the target value doesn't match it means array value doesnt match given target the array iteration then
                
                nums[valid_size]=nums[i]; // storing unmatched value into starting postion of array , cureently nums[valid_size] == 0th position in array later it increases

                
                
                System.out.print(nums[valid_size]); // printing the array values each time
                valid_size++;  // valid_size increses from array index 0 to 1
                

            }
            
           
            
            
        }
        
        //System.out.println("whats happening after incrementing validsize"+valid_size);
        return valid_size;
    }

    public static void main(String[] args) {

        removeElement rm=new removeElement();
        
        int[] nums={1,1,3,2,5,6};// creating array with values
                  //[3,2,5,6]  basically this is how array position are reinitialised
        
        rm.removeElement(nums,1);  // calling function removeElement and passing array and target value

        System.out.println("what"+Arrays.toString(nums));
        //System.out.println(rm.removeElement(nums,1));

        
    }
}