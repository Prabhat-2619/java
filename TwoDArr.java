public class TwoDArr {
    public static void main(String arg[]){
        int k=0;
        int a[][]=new int [3][3];
        for(int i=0;i<=2;i++){
        for (int j=0;j<=2;j++){
        a[i][j]=Integer.parseInt(arg[k]);
        k++;
        }
    }
        for(int m[]:a){
        for(int l:m){ 
        System.out.print(l+" ");}
        System.out.println();}
    }
}
