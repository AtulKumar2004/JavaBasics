// Inverted half pyramid with numbers pattern
public class JavaBasics61 {
    public static void main(String args[]) {
        int n=6;
        // method 1
        for(int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
                           
        }
        // method 2
        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=n+1-i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}