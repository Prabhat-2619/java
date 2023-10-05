class A{
    int x;
    A(int i){
        x=i;
        System.out.println("x="+x);
    }
}
class B extends A{
    B(){
        super(5);
        System.out.println("class B");
    }
}
public class InheritanceJava4{
    public static void main(String []arg){
      B b=new B();
      
    }
}
