import java.util.*;
public class GarbageCollectionDemo
{
    public GarbageCollectionDemo() 
    {
    System.out.println ("Garbage ");   
        
    }
    public void finalize()
    {
        System.out.println ("Garbage Collection performed by JVM");
    }
    public static void main (String args[])
    {
      /* Scanner scan = new Scanner(System.in);
       System.out.println("enter ur name");
       String name= scan.next();
       System.out.println("enter ur age");
       int age=scan.nextInt();
       System.out.println("age is "+age);
       System.out.println("name is"+name);
       scan.close(); */


         GarbageCollectionDemo s1 = new GarbageCollectionDemo ();
       GarbageCollectionDemo s2 = new GarbageCollectionDemo ();
       GarbageCollectionDemo s3 = new GarbageCollectionDemo ();
       s1 = null;
       s2=s3;
       new GarbageCollectionDemo ();
       new GarbageCollectionDemo ();
       new GarbageCollectionDemo ();
        System.gc();  
        //s3.finalize(); */
    }
}