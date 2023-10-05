public class UnderStandException {
   public static void main(String arg[]){
    int x,y,z;
    x=6;
    y=0;
    try{
        z=x/y;
        System.out.println(z);
    }
    catch(ArithmeticException e){
         System.out.println(e.getClass().getName());
         System.out.println( e.getMessage());
    }
    finally{
        System.out.println("Exception Occur");
    }
   } 
}
