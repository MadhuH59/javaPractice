package Arecursion;

public class recursion {

    static void print(int n){

        System.out.println(n);

        print1(2);
    }

    static void print1(int n){

        System.out.println(n);

        print2(3);
    }

    static void print2(int n){

        System.out.println(n);

        print3(4);
    }

    static void print3(int n){

        System.out.println(n);

        print4(n);
    }

    static void print4(int n){

        System.out.println(n);

        
    }
    

    public static void main(String[] args) {
        

        print(1);
    }
}


