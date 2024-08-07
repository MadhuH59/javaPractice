package array.BinarySearch;


public class Peakindex {
    public int peakIndexInMountainArray(int[] arr) {
        

        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){

                end=mid;
            }else{

                start=mid+1;
            }
        }
        return start;


    }

    public static void main(String[] args) {
        
        int[] arr={0,1,0};

        Peakindex pi=new Peakindex();

        int result=pi.peakIndexInMountainArray(arr);
        System.out.println(result);
    }
}