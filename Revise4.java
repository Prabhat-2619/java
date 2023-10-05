//implementation of multiple inheritance
//through interface
interface i{
    void one();
    default void sum(){
        System.out.println("Sum");
    }
}
interface j{
    void two();
    default void sum1(){
        System.out.println("Sum1");
    }
}
interface k{
    void three();
    default void sum3(){
        System.out.println("Sum3");
    }
}
class Demo implements i,j,k{
    public void one(){
        System.out.println("Function one");
    }
    public void two(){
        System.out.println("Function two");
    }
    public void three(){
        System.out.println("Function Three");
    }
}
public class Revise4{
    public static void main(String a[]){
       Demo d1= new Demo();
       d1. one();
        d1.two();
        d1.three();
        d1.sum();
       d1. sum1();
        d1.sum3();
    }
}
