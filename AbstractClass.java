//suppose i will decide a method is define in abstract class then, how that 
//method is initialise
abstract class Demo{
    public abstract void disp();
    public static String s="Prabhat Ranjan";
    private int x ,y;
    public Demo(int x,int y){
        this.x=x;
        int sum=x+y;
        System.out.println("Sum="+sum);
    }
}
class A extends Demo{
    public A(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    public void disp(){
        System.out.println("Disp");
    }
}
public class AbstractClass{
    public static void main(String arg[]){
        A a=new A(4,5);
        a.disp();
        System.out.println(Demo.s);
    }
}
