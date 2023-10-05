import java .util.Scanner;
public class SimilarCharacter {
  public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    char ch,ch1; 
    String str1,str2,str3="";
   System.out.print("Enter 1st string:");
   str1=sc.nextLine();
   int l1=str1.length();
   //System.out.println(length1);
   System.out.print("Enter 2nd string:");
   str2=sc.nextLine();
   int l2=str2.length();
   //char ch,ch1;
   //System.out.println(length2);
   for(int i=0;i<l1;i++){
    ch=str1.charAt(i);
   for(int j=0;j<l2;j++){
    ch1=str2.charAt(j);
     if(ch==ch1){
       str3+=ch;
     }
    }
   }
  System.out.println(str3);
  }

} 

