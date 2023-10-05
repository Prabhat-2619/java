class A extends Thread{
    public void run(){
        for(int x=0;x<5;++x){
            try{
                Thread.sleep(1000);
                System.out.println(x);
            }catch(Throwable e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int x=0;x<5;++x){
            try{
                Thread.sleep(1000);
                System.out.println(x);
            }catch(Throwable e){
                e.printStackTrace();
            }
        }
    }
}
public class Revise10{
    public static void main(String[]a){
        A a1=new A();
        //a1.start();
        B b1=new B();
        //b1.start();
        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);
        t1.start();
        t2.start();
    }
}
