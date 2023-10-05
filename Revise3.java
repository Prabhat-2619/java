interface i{
    void one();
}
interface j extends i{
    void two();
    default void sum(){
        System.out.println("Sum Function");
    }
}
class A implements j{
    public void one(){
        System.out.println("One");
    }
    public void two(){
        System.out.println("Two");
    }
}
public class Revise3{
    public static void main(String arg[]){
        A a1=new A();
        a1.one();
        a1.two();
        a1.sum();
        
}
}