interface iface1{
     String s="Prabhat";
    void one();
}
interface iface2{
     String s1="Ranjan";
    void two();
}
class Demo implements iface1,iface2{
    public void one(){
        System.out.println("One");
    }
    public void two(){
        System.out.println("two");
    }
}
public class MultipleInheritanceInterface{
    public static void main(String arg[]){
        Demo d=new Demo();
        d.one();
        d.two();
        System.out.print(Demo.s+" ");
        System.out.print(Demo.s1);
    }
}
