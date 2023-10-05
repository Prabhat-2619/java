class A{
    public void disp(){
        System.out.println("Class :A");
    }
}
class B extends A{
    public void disp(){
        System.out.println("Class :B");
    }
}
public class Overriding{
     public static void main(String arg[]){
        B b=new B();
        b.disp();
     }
}
