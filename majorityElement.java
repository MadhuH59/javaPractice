package array;

public class majorityElement {

    static int majorityval(int[] nums){

        int count=1;
        int majval=0;
        
        for (int i = 0; i < nums.length; i++) {

            if(count==0){
                majval=nums[i];
            }
            else if(nums[i]==nums[majval]){

                count++;
            }
            else{count--;}
            
        }
        return majval;

        
    }

    public static void main(String[] args) {
        
        int[] nums={6,5,5,7,5};
        int val=majorityval(nums);
        System.out.println(val);


    }
    
}
