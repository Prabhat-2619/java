public class StringUpperCase {
    public static void main(String arg[]){
        String s1="Prabhat Ranjan";
        String s2=s1.toUpperCase();
        System.out.println(s2);
        String s3=s1.substring(4);
        System.out.println(s3);

        String s4=s1.substring(3,6);
        System.out.println(s4);
        Boolean s5=s1.endsWith("Pr");
        System.out.println(s5);
    }
}
