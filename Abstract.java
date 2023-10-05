//an abstract class can  also contain    abstract method as well as non-abstract method
abstract class Demo{
      public abstract void disp();
}
class Child extends Demo{
    public void disp(){
        System.out.println("Display of child class");
    }
}
public class Abstract{
    public static void main(String arg[]){
        Child c=new Child();
        c.disp();
    }

}
