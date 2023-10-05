import java.util.Scanner;

public class DoubleD {
    public static void main(String []args)
    {
        int [][]A = new int[4][3];
        Scanner obj = new Scanner(System.in);
        
        int x,y;
        

        // A[0][0] =34;
        // A[0][2]=9088;
        // System.out.println(A[1][0]);

        for(x=0;x<4;x++)
        {
            for(y=0;y<3;y++)
            {
                System.out.print("Enter Number :");
                A[x][y] = obj.nextInt();
            } 
        }
        
        System.out.println("\nOutput of the Matrix");

        //for(x=0;x<4;x++)
         //{
           // for(y=0;y<3;y++)
            //{
              //   System.out.print(A[x][y]+"\t");
            // }
            // System.out.println();
          //}

        System.out.println("\nUsing For earch style");
        for(int []p:A)
        {
            for(int k:p)
            {
                System.out.print(k+"\t");
            }
            System.out.println();
          }
    }
}


//String
