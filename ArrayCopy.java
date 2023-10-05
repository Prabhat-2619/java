import java.util.Scanner;

public class ArrayCopy {
    public static void main(String arg[]){

        Scanner sc;

        sc=new Scanner(System.in);

        //int size=0;

        int a[][]=new int[3][3];

        int b[][]=new int[3][3];

        int c[][]=new int [3][3];

        //System.out.print("\n Enter The Size Of Array:");
        //size=sc.nextInt();

        System.out.print("\n Enter the elements of array A:");

        for(int x=0;x<a.length;x++){

        for(int y=0;y<a.length;y++){

        a[x][y]=sc.nextInt();}}

        System.out.print("\n Enter the elements of array B:");

        for(int x=0;x<b.length;x++){

         for(int y=0;y<b.length;y++){

        b[x][y]=sc.nextInt();}}

        //System.out.println("Addition Perform");
        for(int x=0;x<c.length;x++){

            for(int y=0;y<c.length;y++){

        c[x][y]=a[x][y]+b[x][y];}}
            
          System.out.println("Output");  

           for(int k[]:c){

            for(int l:k){
                
                System.out.println(l);
            }
            System.out.println();
           }

        }
    }

