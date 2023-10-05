import java.util.*;
class Demo{
    public Demo(){
        x=0;y=0;z=0;
    }
    private int x,y,z;
    public Demo(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void sum(){
        z=x+y;
        System.out.println("Sum="+z);
    }
    public void disp(){
        System.out.println(" x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
public class DoubtClear{
    public static void main(String arg[]){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        Demo d= new Demo();
        Demo d1=new Demo(x,y);
        d.disp();
        d1.disp();
        d1.sum();
    }
}
