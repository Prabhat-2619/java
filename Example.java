 class Demo{
     void disp(){
        System.out.println("Hello DEmo");
     }
     void sum(){
        int x=9;
        int y=8;
         int sum=x+y;
        System.out.println("Sum="+sum);

    }
}
class Child extends Demo{
    void disp(){
        System.out.println("My name is Prabhat Ranjan");
    }
}
  public class Example {
    public static void main(String arg[]){
    Child obj=new Child();
    obj.disp();
    obj.sum();
    //obj.Demo::disp();
    }
}
    
