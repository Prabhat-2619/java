public class SortAsc {
    public static void main (String arg[]){
        int t=0;
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=Integer.parseInt(arg[i]);
            System.out.print(a[i]+ " ");
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
               if(a[i]>a[j]){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
               }
            }
        }
        System.out.print("\nElements of array sorted in Ascending order");
        for(int i=0;i<5;i++){
            System.out.print(a[i] +" ");
        }
    }
    
}
