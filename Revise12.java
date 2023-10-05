class Demo{
    private int x;
    public Demo( int x){
        this.x=x;
    }
    public Demo(Demo d){
        this.x=d.x;
    }
    //public Demo(Demo d1){
        //this.x=d1.x;
   // }
    public void display(){
        System.out.println("The value of x="+x);
    }
}
public class Revise12{
    public static void main(String a[]){
        Demo d1=new Demo(23);
        d1.display();
        Demo d2=new Demo(d1);
        d2.display();
        Demo d3=new Demo(d2);
        d3.display(); 

    }
}
