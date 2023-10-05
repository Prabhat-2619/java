//Here I am Using Partial class with the help of interface
interface i{
    String str="Prabhat Ranjan";
    void one();
    void two();
}
 abstract class A implements i{
    public void one(){
        System.out.println("One");
    }
    abstract  public void sum();
}
class B extends A{
    public void two(){
        System.out.println("Two");
    }
     public void sum(){
        System.out.println("Sum");
     }
}
public class Revise5{
    public static void main(String arg[]){
        B b1=new B();
        System.out.println(i.str);
        b1.sum();
        b1.one();
        b1.two();
    }
} 

