class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        super();
        System.out.println("c");
    }
}
public class MultiLevel1{
    public static void main(String arg[]){
      C obj=new C();
    }
}
