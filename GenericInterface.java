interface iface<T>{
    T getValue(T value);
}
class Demo<T> implements iface<T>{

public  T getValue(T value){
        return value;
}
}
public class GenericInterface{
    public static void main(String arg[]){
        Demo<String> d1=new Demo<String>();
        String ans=d1.getValue("java");
        System.out.println(ans);
        Demo<Integer> d2=new Demo<Integer>();
        int x=d2.getValue(90);
        System.out.println(x);

    }
}
