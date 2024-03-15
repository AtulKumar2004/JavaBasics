// m pattern
public class JavaBasics69 {
    public static void main(String args[]) {
        int n=10;
        int ncol=4*n-3;
        int a,b,c,d,check=0;
        a=n-1;b=n+1;c=2*n+(n-2)-1;d=2*n+(n-2)+1;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=ncol;j++){
                if(i==1){
                    if(j==n || j==2*n+(n-2)){
                        System.out.print("*");
                    }
                    
                    else{
                    System.out.print(" ");
                    }
                    check=1;

                    
                }
                else if(i>1 && i<n){
                    check=0;
                    if(j==a || j==b || j==c || j==d ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                
                }
                else{
                    check=1;
                    if(j==1 || j==ncol || j==(ncol+1)/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            if(check!=1){
                a=a-1; b=b+1; c=c-1; d=d+1;
            }
            System.out.println();
        }
    }
}
                     