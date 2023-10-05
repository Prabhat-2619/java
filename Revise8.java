import java.util.*;
public class Revise8{
    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        int x;
        System.out.println("Enter a number:");
        x=sc.nextInt();
        try{
            if(x==-1){
                throw new ArithmeticException("-ve not allowed");
            }
            System.out.println(x);
        }catch(ArithmeticException e){
           // System.out.println(e.getMessage());
           // System.out.println(e.getClass().getSimpleName());
           e.printStackTrace();
        }
        finally{
            System.out.println("My name is Prabhat Ranjan");
        }
    }
}
