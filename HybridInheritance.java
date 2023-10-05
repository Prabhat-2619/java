class A{
    A(){
        System.out.println("Class A");
    }
}
class B extends A{
    B(){
        System.out.println("Class B");
    }
}
class C extends B{
    C(){
        System.out.println("Class C");
    }
}
class D extends C{
    D(){
        System.out.println("Class D");
    }
}
class F extends D{
    F(){
        System.out.println("Class F");
    }
}
public class HybridInheritance{
    public static void main(String arg[]){
      F f=new F();
    }
}
