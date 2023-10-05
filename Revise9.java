class A{
    public void divide(int x,int y) throws ArithmeticException{
        int z=x/y;
        System.out.println(z);
    }
}
public class Revise9{
    public static void main(String a[]){
        A a1=new A();
        try{
            a1.divide(2,0);
        }catch(Throwable e){
            e.printStackTrace();
        }
    }
}
