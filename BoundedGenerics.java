class Demo{
    public <T extends Number> void show(T value){
        Integer x;
        x=value.intValue()+2;
        System.out.println(x);
    }
}
public class BoundedGenerics{
    public static void main(String arg[]){
        Demo d1=new Demo();
        d1.show(23.90);

    }
}
