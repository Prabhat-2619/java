 class Reverse
 {
    public static void main(String arg[])
    {
        int num,rem,sum=0 ;
        //String s1;
       // s1=arg[0];
        num=Integer.parseInt(arg[0]);
        while(num!=0)
        {
           rem=num%10;
           sum=sum+rem*rem*rem;
           num=num/10;
        }
        System.out.print(sum);
    }
 }
    

