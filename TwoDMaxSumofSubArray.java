package array;

public class TwoDMaxSumofSubArray {

    static int maxvalsubarr(int[][] nums){

        int maxValSumSubArr=0;// Integer.MIN_VALUE;// TO MAX VALUE of sum 
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = 0; j < nums[i].length; j++) {

                sum+=nums[i][j];

                
            }
            if(sum>maxValSumSubArr){
                maxValSumSubArr=sum;
            }
            
        }
        return maxValSumSubArr;

    }

    public static void main(String[] args) {
        
        int[][] nums={{1,2,3,4},{5,6,7,8}};

        int result=maxvalsubarr(nums);

        System.out.println(result);
    }
    
}
