import java.util.Scanner;

class Demo{
    private int num;
    public Demo(){ num=0;}

    public Demo(int num){
        this.num=num;
    }
    public Demo(Demo obj){
        this.num=obj.num;
    }
    public void Disp(){
        System.out.println(this.num);
    }
}
class Constructor{
    public static void main(String arg[]){
        Demo d1=new Demo(4);
        d1.Disp();
        Demo d2=new Demo(d1);
        d2.Disp();


    }
}