public class TocharArray {
    public static void main(String arg[]){
        String str=new String("java");
        System.out.println(str);
        //convert string into char Array
        char c[]=str.toCharArray();
        //for(int k=0;k<c .length;k++){
        System.out.println(c);
        
        int x=str.indeOf('j');
        System.out.println(x);
        int x1=str.lastIndexOf('a');
        System.out.println(x1);
        boolean b=str.endsWith("va");

        }

}
