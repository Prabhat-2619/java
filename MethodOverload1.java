class Demo{
    void Area(){
       System.out.println("No Argument"); 
    }
    void Area(double n){
        double area;
        area=3.14*n*n;
        System.out.println("Area Of Circle="+area);
    }
    void Area(double l,double b){
        double area;
        area=l*b;
        System.out.println("Area Of Rectangke="+area);
    
    }
    void Area(int x){
        System.out.println(x);
    }
    
}
public class MethodOverload1{
    public static void main(String arg[]){
        Demo d1=new Demo();
        d1.Area();
        d1.Area(2.9, 8.9);
        d1.Area(90.0);
        d1.Area(90);
    }
}
