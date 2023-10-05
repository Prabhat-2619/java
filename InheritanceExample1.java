class A{
    int x=5;
    String s="class A";
    A(){
        System.out.println("Constructor Of class A");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor of class B");
    }
    void show(){
        System.out.println("x= "+x);
        System.out.print(s);
    }
}
class InheritanceExample1{
    public static void main(String arg[]){
        B b=new B();
        b.show();
    }
}
