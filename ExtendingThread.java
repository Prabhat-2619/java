class MyThread extends Thread{
    public void run(){
        for(int x=1;x<=5;x++){
            System.out.println(x);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ExtendingThread{
    public static void main(String arg[]){
        MyThread t1=new MyThread();
        t1.start();
        //MyThread t2=new MyThread();
       // t2.start();
    }
}
