import java.util.Scanner;
enum month{jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec,wrong};
public class MonthEnum {
    public static  void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s1;
        System.out.println("Enter a Month Name at Least 3 Word:");
         s1=sc.nextLine();
         month ref=month.valueOf(s1);
         switch(ref){
            case jan:System.out.println("31 Days");break;
            case feb:System.out.println("28D Days");break;
            case mar:System.out.println("31 Days");break;
            case apr:System.out.println("30 Days");break;
            case may:System.out.println("31 Days");break;
            case jun:System.out.println("30 Days");break;
            case jul:System.out.println("31 Days");break;
            case aug:System.out.println("31 Days");break;
            case sep:System.out.println("30 Days");break;
            case oct:System.out.println("31 Days");break;
            case nov:System.out.println("30 Dys");break;
            case dec:System.out.println("31 Days");break;
            default:System.out.println("Wrong");
         }
    }
}
