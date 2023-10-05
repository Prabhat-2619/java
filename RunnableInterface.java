class MyThread implements Runnable{
    Thread t;
    public MyThread(){
        t=new Thread(this);
        t.start();
    }
    public void run(){
        System.out.println("New child created");
    }
}
public class RunnableInterface{
    public static void main(String arg[]){
        MyThread m1=new MyThread();
    }
}
