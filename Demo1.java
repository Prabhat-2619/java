interface iface{
    int max(int a,int b,int c);
}
class Demo1{
    public static  void main(String arg[]){
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        int c=Integer.parseInt(arg[2]);
        iface iref=(r,s,t)->(r>b)?(a>c?a:c):(s>t?b:c);
          int o=iref.max(a,b,c);
          System.out.println(o);
    }
}
