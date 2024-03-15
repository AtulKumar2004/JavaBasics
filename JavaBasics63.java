// 0-1 triangle pattern
 public class JavaBasics63 {
    public static void main(String args[]) {
        int n=5;
        //int change=1;
        // method 1:
        // for (int i=1;i<=n;i++){
        //     change=(i%2==0)?0:1;
        //     System.out.print(change);
        //     for(int j=1;j<=i-1;j++){
        //         change=(change==1)?0:1;
        //         System.out.print(change);
        //     }
        //     System.out.println();
        // }
        // method 2:
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i+j)%2==0?1+" ":0+" ");
            }
            System.out.println();
        }
    }
        
}