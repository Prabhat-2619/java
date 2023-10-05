class Demo{
    public void disp(){
        System.out.println("Hello");
    }
    // public void finalize(){
    //     System.out.println("Memory cleaned");
    // }


}

public class GarbageCollection{
    public static void main(String arg[]){
       // Demo d1=new Demo();
        new Demo();
        
        // d1=null;
        //d2.disp();
        // System.gc();
    }
}
