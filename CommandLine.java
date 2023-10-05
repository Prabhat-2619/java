public class CommandLine {
    public static void main(String arg[]){
        String s1,s2;
        int x,y,sum;
        s1=arg[0];
        s2=arg[1];
        System.out.println(s1+"  "+s2);
        x=Integer.parseInt(arg[2]);
        y=Integer.parseInt(arg[3]);
        sum=x+y;
        System.out.println("Sum="+sum);
    }
}
