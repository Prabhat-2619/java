import java.util.*;
public class Str1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter 2 String:");
        s1=sc.nextLine();
        s2=sc.nextLine();
        int x=s1.compareTo(s2);
        System.out.println(x);
        boolean a=s1.equals(s2);
        System.out.println(a);
        boolean b=s1.endsWith("jan");
        System.out.println(b);
        boolean c=s2.startsWith("Bik");
        System.out.println(c);
        int x1=s1.length();
        System.out.println("Length of String s1="+x1);
        int x2=s2.length();
        System.out.println("Length of String s2="+x2);
        String s3,s4;
        s3=s1.substring(3);
        System.out.println("s3="+s3);
        s4=s1.substring(3, 13);
        System.out.println("s4="+s4);

    }
}
