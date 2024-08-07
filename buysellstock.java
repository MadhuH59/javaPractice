package array;

public class buysellstock {

    static int maxProfitVal(int[] nums){

        int minVal=Integer.MAX_VALUE;
        int maxprofit=0;

        for (int i = 0; i < nums.length-1; i++) {
            
            if(nums[i]<minVal){

                minVal=nums[i];
            }
            else if(nums[i]-minVal>maxprofit){

                maxprofit=nums[i]-minVal;
            }
        }
        return maxprofit;


    }

    public static void main(String[] args) {
        
        int[] nums={1,3,2,6,4,7};

        int result=maxProfitVal(nums);
        System.out.println(result);

    }
    
}
