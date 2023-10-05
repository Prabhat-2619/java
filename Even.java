import java.util.Scanner;
public class Even {

    public static void main(String a[]){
    
Scanner sc=new Scanner(System.in);
  int r,c;
//r:row
//c:column

int [][]A =new int [3][3]; 

int B[][]=new  int[3][3];    

int C[][]=new int [3][3];

for( r=0;r<A.length;r++){

    for(c=0;c<B.length;c++){

      System.out.print("Eneter the elements of array A:");

       A[r][c]=sc.nextInt();
    }
 //System.out.println();
}
for(r=0;r<B.length;r++){

    for(c=0;c<B.length;c++){

      System.out.print("Enter the element of array B:");

      B[r][c]=sc.nextInt();
    }
   // System.out.println();
}
  //sum of two array
for(r=0;r<C.length;r++){

    for(c=0;c<C.length;c++){

        C[r][c]=A[r][c]+B[r][c];
    }
    //System.out.println();
}
System.out.println("Output Of yhe matrix are:");

for(int []k:C){

    for(int n:k){

        System.out.print(n+"\t");
    }
    System.out.println();
}
System.out.println("Even number are:");
for(r=0;r<C.length;r++){

    for(c=0;c<C.length;c++){

        if( C[r][c]%2==0){

            System.out.print(C[r][c]+"\t");
        }
        
    }
}
    }
}


