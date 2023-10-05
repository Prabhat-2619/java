public class DemoClass {
    public static void main(String arg[]){
        Thread t=Thread.currentThread();
        t.setName("Master");
        System.out.println(t);
        System.out.println(t.getName());
    }
}
