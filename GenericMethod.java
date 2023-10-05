class Demo{
    public <T> void show(T value){
        System.out.println(value);
    }
}
public class GenericMethod{
   public static void main(String arg[]){
    Demo d1=new Demo();
     d1.show(12);
     d1.show("java");
   }
}
