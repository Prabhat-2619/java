class A{
    int x=5;
    A(){
        System.out.println("class A");
    }
}
class B extends A{
    int y=10;
    B(){
        System.out.println("Class B");
    }
}
class C extends B{
    int z=20;
     C(){
        System.out.println("Class c");
     }
     public void show(){
        System.out.println("Sum="+(x+y+z));
     }
}
public class MultiLevelInheritance{
    public static void main(String arg[]){
        C c=new C();
        c.show();
    }
}
