import java.util.Scanner;
interface iface{
    int max(int x,int y);
}
public class LambdaMax{
    public static void main(String arg[]){
      Scanner sc;
      sc=new Scanner(System.in);
      System.out.println("Enter two number");
      int x=sc.nextInt();
      int y=sc.nextInt();
      iface iref=(c,v)->c>v?c:v;
      System.out.println("Max number="+iref.max(x,y));
    }
}
