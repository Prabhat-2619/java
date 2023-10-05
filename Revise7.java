//here i have used blocked Lambda Expression
//with help of interface
// here One Of the important point is not to implements the Interface.but how
//can i access the method inside the interface:-Ans:We create the reference of 
//interfce inside the main class and after that i can acces the method with the 
//with the help of interface;
import java.util.Scanner;
interface i{
    int max(int a,int b,int c);
}
public class Revise7 {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter three Numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        i iref=(m,n,o)->{
            int max=(x>y)?(x>z?x:z):(y>z?y:z);
            return max;
        };
        int r=iref.max(x,y,z);
        System.out.println(r);
    }
}