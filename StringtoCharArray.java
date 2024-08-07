import java.util.*;

public class StringtoCharArray {

	public static void main(String args[])
	{

		String str = "aba";
		

		// Call the toCharArray() method
        // Store the result in a char array
		char[] arr = str.toCharArray();

		// Printing the character array
        //using for each
	  /*for (char x : arr)
		{
			System.out.println(x);
		} */
        // using for loop
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
		// sstring to char in reverse order
		for(int i=arr.length-1;i>=0;i--)
		{
            System.out.println(arr[i]);

			

		
        }
    }
}