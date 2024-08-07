package stringpractice;

public class stringpattern {

    static void pattern1(int n){

        for (int row = 0; row <=n; row++) { // step 1: identify the length of the rows ie check how many rows 
            
            for (int col = 0; col <= row; col++) { // step 2: identify number of column and find the equation between row and column NOTE: find equation b/w row and col
                System.out.print("*" );         // step 3: print * Note use print not println
                
            }
            System.out.println(""); // after printing it has to go next line;
        }
    }

    static void pattern2(int n){

        for (int row = 0; row <=n; row++) { // step 1: identify the length of the rows ie check how many rows 
            
            for (int col = 0; col <= n; col++) { // step 2: identify number of column and find the equation between row and column NOTE: find equation b/w row and col
                System.out.print("*" );         // step 3: print * Note use print not println
                
            }
            System.out.println(""); // after printing it has to go next line;
        }
    }

    static void pattern3(int n){

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n-row+1; col++) {

                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
    

    public static void main(String[] args) {
        
        pattern1(4);
        System.out.println( "patern 2 is below");
        pattern2(4);
        System.out.println( "patern 3 is below");
        pattern3(4);
    }
    
}
