class A{
    public void show(){
        System.out.println("Show in class A");
    }
}
class B {
    public void show(){
        System.out.println("Show in class B");
    }
}
class Revise2 extends A,B{
    public static void main(String arg[]){
        Revise2 e=new Revise2();
        e.show();
    }
}
