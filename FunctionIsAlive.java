class MyThread implements Runnable{
     Thread t;
     public MyThread(){
        t=new Thread(this);
         t.start(); 
     }
      public void run(){
        int x;
        for(x=1;x<=5;x++){
            System.out.println(x);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
     }
}
public class FunctionIsAlive{
    public static void main(String arg[]){
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        System.out.println(th1.t.isAlive());
        System.out.println(th2.t.isAlive());
        for(int x=1;x<=10;x++){
            System.out.println(x);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
         System.out.println(th1.t.isAlive());
         System.out.println(th2.t.isAlive());
    }
}
