      import java.util.Scanner;
     class MethodReturn {
       static int x,y;
         static int great(){
        //int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 vaalues=");
        x=sc.nextInt();
        //System.out.print("Enter 2 values=");
        y=sc.nextInt();
        if(x>y)
        return x;
        else 
        return y;
       }
          //public class MethodReturn{
       public static void main(String arg[]){
           int i;
           MethodReturn a=new MethodReturn();
           i= a.great();
           System.out.print("Greatest value is="+i);
       }

    }

