// diamond pattern
public class JavaBasics67 {
    public static void main(String args[]) {
        // method 1:
        // int n=8;
        // int ad=n/2-1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-1; j++){
        //         if(i<=n/2){
        //             System.out.print((j>=n-(i+ad) && j<=i+ad)?"*":" ");
        //         }
        //         else{
        //             System.out.print((j>=i-(n/2) && j<=n-(i-n/2))?"*":" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // method 2:
        int n=7;
        // 1st half
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n;i>=1;i--){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}