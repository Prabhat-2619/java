public class Revise {
    public static void main(String arg[]){
        String str=new String("java");
        String s1=str.toUpperCase();
        System.out.println(s1);
        String s2=str.toLowerCase();
        System.out.println(s2);
       // String str1=new String("Prabhat");
       // System.out.println(str1.equals(str));
       // boolean b=str1.equals(str);
       // System.out.println(b);
       String x="Prabhat";
       System.out.println(x.equals(str));
       boolean b=x.endsWith("at"); 
       System.out.println(b);
       String x1=x.substring(2,6);
       System.out.println(x1);
       int x2=x.compareTo(str);
       System.out.println(x2);

    }
}
