 class A implements Runnable{
     Thread t;
    public A(){
         t=new Thread(this);
        t.start();
    }
    public void run(){
        System.out.println("New child thread created");
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
public class MyThread{
    public static void main(String arg[]){
        A a=new A();

    }
    
}
