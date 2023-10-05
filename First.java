import java.util.Scanner;

public class First

{
public static void main(String []args){

    Scanner sc=new Scanner(System.in);

     int []A=new int[4];  

     int []B=new int[4];

    for(int n:A){

        System.out.print("Enter array element of A:");

        n=sc.nextInt(); 

    }
    System.out.println("-------------");

    System.out.print("Copy all array element from A to B:");

    for(int x=0;x<A.length;x++){

        B[x]=A[x];

        System.out.print(B[x]);

    }
}    
}
