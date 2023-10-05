import java.util.Scanner;
enum Month{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
public class EnumValues {
    public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
      String s1;
      System.out.println("Enter a Month name at least 3 word:");
      s1=sc.next();
      Month ref[]=Month.values();
      //int x=0;
      for(Month m:ref){
        System.out.println(m);

      }
    }
    
}
