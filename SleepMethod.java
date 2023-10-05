public class SleepMethod {
    public static void main(String arg[]){
        try{
            for(int x=0;x<=0;x++){
                System.out.println(x);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
