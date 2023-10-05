class Parent{
    public Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child");
    }
}
public class SingleLevel{
    public static void main(String arg[]){
        Child d1=new Child();
    }
}
