package array.BinarySearch;

import java.io.*;

class BinarySearch {
  
    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x)
    {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if x is present at mid
            /*if (arr[mid] == x)
                return mid; */

            // If x greater, ignore left half
            if (x>arr[mid]){
                start = mid + 1;
            }

            // If x is smaller, ignore right half
            else if(x<arr[mid]){
                end = mid - 1;
            }else return mid;
        }

        // If we reach here, then element was
        // not present
        return -1;
        //return arr[end];
    }

    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 5;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else 
            System.out.println("Element is present at "
                               + "index " + result);
            System.out.println("value is "+arr[result]);               
    }
}
