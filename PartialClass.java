interface iface{
    void one();
    void two();
}
abstract class A implements iface{
    public void one(){
        System.out.println("one");
    }
}
class B extends A{
    public void two(){
        System.out.println("two");
    }
}
public class PartialClass{
    public static void main(String arg[]){
        B b=new B();
        b.one();
        b.two();
    }
}
