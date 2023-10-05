class Demo1 extends Thread{
    public void run(){
        for(int x=0;x<=5;x++){
            System.out.println(x);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
class Demo2 extends Thread{
    public void run(){
        for(int x=0;x<=5;x++){
            System.out.println(x);
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
public class MyThread1{
    public static void main(String arg[]){
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);
        t1.start();
        t2.start();
        d1.start();
        d2.start();
    }
}
