import java.util.Scanner;
public class Revise14 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a []=new int[2];
        int b []=new int[2];
        int c []=new int[2];
        System.out.println("Enter the Element of array A:");
        for(int i=0;i<2;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the ELEMENT OF B:");
        for(int i=0;i<2;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<2;i++){
                 c[i]=a[i]+b[i];
            
            System.out.println(c[i]);}
        }
    }

