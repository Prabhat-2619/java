import java.util.Scanner;
class A {
void show(int x,int y,int z){ 
    if(x>y&&x>z)
    System.out.println("Greatest="+x);
    else if(y>z)
    System.out.println("Greatest is="+y);
    else
    System.out.println("Gretatest is="+z);
}
}
  
public class SimpleMethodExample{
public static void main(String arg[]){
    int i,j,k;
      Scanner sc=new Scanner(System.in);
    System.out.print("Enter three values=");
    i=sc.nextInt();
    j=sc.nextInt();
    k=sc.nextInt();
    A a=new A();
    a.show(i, j, k);
}
}
