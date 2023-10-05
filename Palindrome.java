import java.util.Scanner;
public class Palindrome {
    public static void main(String s[]){
        int i,j;
     Scanner sc=new Scanner(System.in);
      boolean pallin=true;
      String str;
      System.out .print("Enter string:");
      str=sc.next();
      char x;
      j=str.length()-1;
      loop:for(i=0;i<str.length();i++){
        if(str.charAt(i)!=str.charAt(j)){
            pallin=false;
            break loop;
           }
           j--;
        }
        if(pallin)
        System.out.print("it is palindrome");
        else
        System.out.print("It is not palindrome");
      }


    }



    

