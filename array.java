package array;


import java.util.*;
public class array {
    
    public static void main(String[] args){

        // declaration of arrar
        int[] regid = new int[5]; // new keyword is used to create an object
    
        regid[0]=112;  // array initialize


       

        int[] rno= new int[]{1,2,3,4}; // directly declare an dinitialise
        int[] name={5,4,8};// diect intialize
        // Syntax of array
        int rid[]; // declaring : it jjust define to stack 
        rid= new int[5]; //initializing of array and it creats the object in heap memory
        
        
        // arrays of primitive 
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        
        for(int i=0;i<num.length;i++){ // using  for loop insert multiple inputs
            num[i]=sc.nextInt();

            //System.out.println(num[i]);
        }

        for(int i=0;i<num.length;i++){
            System.out.println(num[i] + " ");
        } 

        System.out.println(Arrays.toString(num));

        /*for(int j: num){

            System.out.print(j);
        }*/

        // arrays of object : string objects
        System.out.println("lets print  string arrays objects");
        Scanner so=new Scanner(System.in);

        String[] str = new String[5];

        for(int i=0;i<str.length;i++){
            str[i]=so.nextLine();
        }

        System.out.println(Arrays.toString(str)); // prints in string format output :[aa,bb,cc,dd,ee]

        for(String q: str){
            System.out.println(q);
        }




        
    }
}
