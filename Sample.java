public class Sample
{
public static void main(String args[]) {
    int x=10;
    int y=2;
    if(x+y>20)
    {
        System.out.println("X +y is greter than 20");
    }
    else {
        System.out.println("X +y is not greter than 20");
    }
    int num=3;
    switch(num)
    {
        case 1: 
        System.out.println("num is 1");
        break;
        case 2: 
        System.out.println("num is 2");
        break;
        case 3: 
        System.out.println("num is "+num);
        break;
        default:
        System.out.println(" num is not valid");


    }
}
}
