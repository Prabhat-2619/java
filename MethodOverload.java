class Demo{
    int x,y,z;
    public Demo(){
        System.out.println("Nothing");
    }
    public Demo(int x,int y ){
        this.x=x;
        this.y=y;
        this.z=this.x+this.y;
    }
    public void show(){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("sum="+z);
    }
    public Demo(double l,double b){
        double p;
        p=2*(l+b);
        System.out.println("Perimeter of rectangle="+p);
    }
}
public class MethodOverload{
    public static void main(String aarg[]){
        Demo d1=new Demo();
        Demo d2=new Demo(2,5);
        d2.show();
        Demo d3=new Demo(2.90,8.9);

    }
}