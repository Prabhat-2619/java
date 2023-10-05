import java.util.Scanner;
interface iface{
    String oddEven(int x);
}
 public class Lambda{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a nummber");
        x=sc.nextInt();
        iface iref=(n)->n%2==0?"Even":"Odd";
        System.out.print(iref.oddEven(x));
    }
}
