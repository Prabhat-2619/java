public class OneDArr {
    public static void main(String arg[]){
        int a[]=new int [5];
    int sum=0;
     for(int i=0;i<5;i++){
        a[i]=Integer.parseInt(arg[i]);
        System.out.print(a[i]+" ");
     }
     for(int l:a){
        sum=sum+l;

     }  
     System.out.print("\n Sum=" +sum);
}
}