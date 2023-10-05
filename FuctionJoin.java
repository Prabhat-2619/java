class MyThread implements Runnable{
    Thread t;
    public MyThread(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
      for(int x=1;x<=5;x++){
        System.out.println(x);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
}
public class FuctionJoin{
    public static void main(String arg[]){
       MyThread th1=new MyThread();
       MyThread th2=new MyThread();
       System.out.println(th1.t.isAlive());
       System.out.println(th2.t.isAlive());
       for(int x=0;x<=5;x++){
        System.out.println(x);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
       }
       try{
        th1.t.join();
        th2.t.join();
       }catch(InterruptedException e){
        System.out.println(e);
       }
       System.out.println("End Of Main Program");
    }
}

