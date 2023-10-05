import java.util.Scanner;
public class ArrayMultiply {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        System.out.println("Enter the Element of A:");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                a[x][y]=sc.nextInt();
            }
        }
        System.out.println("Enter the Element of B");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                b[x][y]=sc.nextInt();
            }
        }
        System.out.println("Perform Multiplication:");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                c[x][y]=0;
                for(int z=0;z<2;z++){
                c[x][y]+=a[x][z]*b[z][y];}
            }
        }
        System.out.println("Output");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(c[x][y]+" ");
            }
            System.err.println();
        }
    }
}
