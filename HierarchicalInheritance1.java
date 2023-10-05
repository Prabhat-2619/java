class A{
    int x;
    A(){
        System.out.println("Class A");
    }
    }

class B extends A{
    B(){
        System.out.println("class B");
    }
}
class D extends B{
    D(){
        System.out.println("Class D");
    }
}
public class HierarchicalInheritance1{
    public static void main(String arg[]){
        D d1=new D();
    }
}


