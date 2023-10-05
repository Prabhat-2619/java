import java.util.Scanner;
interface iface{
    String oddEven(int x);
}
public class BlockedLambda{
    public static void main(String arg[]){
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int y=sc.nextInt();
        iface iref=(u)->{
            if(u%2==0)
            return "Even";
            else
            return "Odd";
        };
        System.out.print("Number is  " +iref.oddEven(y));
    }
}
