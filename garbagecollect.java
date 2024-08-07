package garbageCollector;

import java.util.*;
public class garbagecollect
{
    public garbagecollect() 
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


       garbagecollect s1 = new garbagecollect ();
       garbagecollect s2 = new garbagecollect ();
       garbagecollect s3 = new garbagecollect ();
       s1 = null;
       s2=s3;
       new garbagecollect ();
       new garbagecollect ();
       new garbagecollect ();
        System.gc();  
        //s3.finalize(); */
    }
}