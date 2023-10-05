public class Demo{
    public void disp(){
     System.out.println("Hello");
    }
    public void finalize(){
        System.out.println("Memory Cleaned");
    }
}

 class Garbage{
   public static void main(String arg[]){
     new Demo();
    new Demo();
     
     System.gc();
     
   } 
}
