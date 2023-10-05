class Test<T>{
    T k;
    public Test(T  k){
        this.k=k;
    }
    public T disp(){
        return this.k;
    }
}
public class TestGenerics{
    public static void main(String arg[]){
        Test<Integer>iobj=new Test<Integer>(89);
        System.out.println(iobj.disp());
        Test<String>sobj=new Test<String>("Prabhat Ranjan");
        System.out.println(sobj.disp());
        
    }
}
