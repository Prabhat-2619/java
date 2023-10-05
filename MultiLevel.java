class GrandFather{
     public GrandFather(){
        System.out.println("Grand Father");
    }
}
class Father extends GrandFather{
    public Father(){
        System.out.println("Father");
    }
}
class Son extends Father{
    Son(){
        System.out.println("Son");
    }
}
class MultiLevel{
     public static void main(String arg[]){
        Son s1=new Son();
     }
}
