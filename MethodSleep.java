public class MethodSleep {
    public static void main(String arg[]){
        try{
            int x;
            for(x=0;x<=5;x++){
                System.out.println(x);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
