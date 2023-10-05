class Parent{
    private int x;
    public Parent(int x){
        this.x=x;
        }
        public void dispx(){
            System.out.println(x);
        }       
    }
    class Child extends Parent{
        private int y;
        public  Child(int x,int y){
            super(x);
            this.y=y;
        }
        public void dispy(){
            System.out.println(y);
        }
    }
    public class Super{
        public static void main(String arg[]){
            Child obj=new Child(3,8);
              obj.dispx();
              obj.dispy();
        }
    }

