class Parent{
    private int x;
    public Parent(int x){
        this.x=x;
    }
    public void dispx(){
        System.out.println(x);
    }
}
class Child extends Parent{
    private int y;
    public Child(int x,int y){
        super(y);
        this.y=x;
    }
    public void dispy(){
        System.out.println(y);
    
    }
}
public class BaseClassInitialization{
    public static void main(String arg[]){
       Child obj=new Child(6,7);
       obj.dispx();
       obj.dispy();
    }
}
