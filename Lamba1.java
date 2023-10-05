
import java.util.Scanner;
interface iface{
    String conversion(String  a);
}
public class Lamba1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String x;
        System.out.print("Enter any String:");
        x=sc.nextLine();
        iface ref=(a)->{
              String y=x.toLowerCase();
            return y;
        };
            System.out.print(ref.conversion(x));
        }
    }


