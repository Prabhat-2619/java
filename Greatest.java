public class Greatest {
    public static void main(String arg[]){
          int  max=0;
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=Integer.parseInt(arg[i]);
            System.out.print(a[i] +" ");
        }
        for(int k:a){
            if(k>max){
            max=k;
            }
        }
            System.out.print("\nMaximum number="+max);
        
    }
    
}
