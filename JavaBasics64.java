// butterfly pattern
public class JavaBasics64 {
    public static void main(String args[]) {
        int n=19;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=n/2){
                    System.out.print((j>(n-i) || j<=i)?"*":" ");
                }
                else{
                    System.out.print((j>=i || j<=n-i+1)?"*":" ");
                }
            }
            System.out.println();
        }
        // one more method is given in notebook!
    }
}
