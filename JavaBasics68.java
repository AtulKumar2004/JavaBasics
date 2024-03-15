// number pyramid pattern
public class JavaBasics68 {
    public static void main(String args[]) {
        int n=5;
        int ncol=2*n-1;
        int change=n;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=ncol; j++){
                if(j>=change && j<=ncol-change+1){
                    System.out.print(i+" ");
                    j++;
                }
                else{
                    System.out.print(" ");
                }
            }
            change--;
            System.out.println();
        }
    }
}