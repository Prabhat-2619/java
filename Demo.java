import java.rmi.server.SocketSecurityException;

enum FRUIT{MANGO,GUAVA,GRAPES}
class Demo{
  public static void main(String arg[]){
    FRUIT fr=FRUIT.MANGO;
    switch(fr){
      case MANGO:System.out.print("Rs:140");break;
      case GRAPES:System.out.print("Rs 30");break;
    }
  }
}