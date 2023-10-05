import java.util.Scanner;

public class Prabhat
{
    public static void main(String []args)
    {
        // new : to allocate the memory

        Scanner sc= new Scanner(System.in);

        int A[]=new int[5];

        int B[]=new int[5];

        int C[]=new int[5];
         
        for(int p:A){

          System.out.print("Enter the element of Array A:");

          p=sc.nextInt();
         }
         
         for(int q:B){

          System.out.print("Enter the Element of Array B:");

          q=sc.nextInt();
         }

         System.out .println("Sum of two array are:");

         for(int x=0; x<C.length;x++){

            C[x]=A[x]+B[x];

           System.out.println(C[x]);
         }

         System.out.println("Output of the array");

        for(int x=0;x<C.length;x++){

          System.out.println(C[x]);
        
          System.out.println("Using For each style");
          
          for(int p:C)
          {
            System.out.println(p);
          }
        
    }
    } 
}

