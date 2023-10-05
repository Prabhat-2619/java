class A{
    int x=10;
}
class B extends A{
int x=20;
void show(){
    System.out.println("x="+x);
    System.out.println("x="+super.x);
}
}
public class InheritaceExample2{
    public static void main(String arg[]){
        B b=new B();
        b.show();
    }
}
