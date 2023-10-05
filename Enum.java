enum FRUIT{JAN,FEB,MAR,APR,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC}

public class Enum {
    public static void main(String arg[]){
        FRUIT f;
        f=FRUIT.JAN;
        switch(f){
            case JAN:
            System.out .println("31 Days");break;
            case FEB:
            System.out.println("28 Days");break;
            case MAR:
            System.out.println("31 Days");break;
            case APR:
            System.out.println("30 Days");break;
            case MAY:
            System.out.println("31 Days");break;

            case JUNE:System.out.println("30 Days");break;

            case JULY:System.out.println("31 Days");break;

            case AUG:System.out.println("31 Days");break;

            case SEP:System.out.println("30 Days");break;

            case OCT:System.out.println("31 Days");break;

            case NOV:System.out.println("30 Days");break;

            case DEC:System.out.println("31 Days");break;

        }
    }
}

