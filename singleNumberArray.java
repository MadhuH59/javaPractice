package array;

public class singleNumberArray {

public static void main(String[] args){

    

    int[] arr = new int[]{1,2,2};

    int n=arr.length;

    int singleNumber=0;

    for(int i=0;i<n;i++){
        singleNumber ^=arr[i];

        System.out.println(singleNumber);
    }
}
    
}
