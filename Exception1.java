class Demo{
    public void divide(int x, int y){
        int z=x/y;
        System.out.println(z);
    }
}
class Exception1{
    public static void main(String arg[]){
        Demo d=new Demo();
        try{
            d.divide(5,0);

        }catch(Throwable e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
