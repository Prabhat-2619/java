interface iface{
    void one();
    default void two(){
        System.out.println("It is Default");
    }
}
class Demo implements iface{
    public void one(){
        System.out.print("two");
    }
}
public class Default{
    public static void main(String arg[]){
        Demo d=new Demo();
        d.one();
        d.two();
    }
}
