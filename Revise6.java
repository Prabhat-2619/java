//Here I am using Method Overrinding Concept
class Dog{
    public void animal(){
        System.out.println("Animal is Dog");
    }
}
class Horse extends Dog{
    public void animal(){
        System.out.println("Animal is horse");
    }
}
public class Revise6{
    public static void main(String a[]){
      Horse h1=new Horse();
      h1.animal();
    }
}
