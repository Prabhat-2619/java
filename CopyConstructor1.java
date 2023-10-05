class Area{
    private double a1;
    public Area(){
        System.out.println();
    }
    public Area(double a1){
        this.a1=a1;
        System.out.println(a1);
        //double circle;
       // circle=3.14*r*r;
       // System.out.println(circle);
    }
    public Area(Area a){
        double k=a.a1;
        System.out.println(k);
    }
}
public class CopyConstructor1{
    public static void main(String arg[]){
        Area a1=new Area(3.0);
        Area a2=new Area(a1);
    }
}
