class A{
    int x=5;
    A(){
        System.out.println("class A");
    }
}
class B extends A{
    int y=10;
    B(){
        System.out.println("class B");
    }
}
class C extends A{
    int z=20;
    C(){
        System.out.println("class C");

        }
        public void show(){
            System.out.println("sum="+(x+z));
        }
    }
    public class HierarchicalInheritance{
        public static void main(String []arg){
            C c=new C();
            c.show();
        }
    }

