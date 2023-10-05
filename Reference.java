interface iface{
    void one();
    default void two(){
        System.out.print("\n Default method");
    }
}
class Demo implements iface{
    public void one(){
        System.out.print("\n Hi i m 1st");
    }
    //public void two(){
        //System.out.print("\n Hello i m 2nd");
    
    void disp(){
        System.out.print("\n Yes i m Display Function");
    }
}
public class Reference{
    public static void main(String arg[]){
        Demo d1=new Demo();
        d1.one();
        d1.two();
        //d1.disp();
        //iface ref=d1;
        //ref.one();
       // ref.two();

    }
}

