import java.util.Scanner;

public class Testprogram
{
  public static void main(String []args){

    Scanner sc=new Scanner (System.in);

    int []A=new int[5];

    int []B=new int[5];

    int x;

    for(x=0;x<5;x++){

      System.out.print("Enter a number:");

      A[x]=sc.nextInt();
    }
    for(int n:B){
      
      System.out.println(n);
    }
  }
}

 
 
