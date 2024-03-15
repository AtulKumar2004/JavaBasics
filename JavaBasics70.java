// palindromic pattern with numbers pattern
public class JavaBasics70 {
    public static void main(String args[]) {
        int n=5;
        int ncol=2*n-1;
        int change=n,check=0,c;
        for(int i=1; i<=n; i++){
            c=i;
            check=0;
            for(int j=1; j<=ncol; j++){
                if(j>=change && j<=ncol-change+1){
                    if(c==1){
                        System.out.print(c);
                        check=1;
                    }
                    else{
                        System.out.print(c);

                    }
                    if (check==1){
                        c++;
                    }
                    else{
                        c--;
                    }
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