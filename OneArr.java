public class OneArr {
    public static void main(String arg[]){
        int a[]=new int[5];
        int b[]=new int [5];
        int sum[]=new int [5];
        for(int i=0;i<5;i++){
            a[i]=Integer.parseInt(arg[i]);
            System.out.print(a[i] + " ");
        }
        for(int i=0;i<5;i++){
            b[i]=Integer.parseInt(arg[i]);
            System.out.print(b[i]+ " ");
        }
        for(int i=0;i<5;i++){
            sum[i]=Integer.parseInt(arg[i]);
             sum[i]=a[i]+b[i];
            System.out.print(sum[i]);
        }
        

        
    }
    
}
