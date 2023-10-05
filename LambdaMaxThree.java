import java.util.Scanner;
interface iface{
    int max(int x,int y,int z);
}
public class LambdaMaxThree{
    public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
      int a,b,c;
      System.out .println("enter 3 number:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      iface iref=(p,q,r)->{
        int m =(a>b)?(a>c?a:c):(b>c?b:c);
        return m;
        };
      int r=iref.max(2,3,4);
      System.out.println("Maximum number is:"+r);  
    }
}
