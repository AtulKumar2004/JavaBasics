// print primes in range
public class JavaBasics78 {
    // public static boolean isPrime(int n){
    //     for (int i=2;i<=n-1;i++){
    //         if(n%i==0){ // completely dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){ // optimized approach
            if(n%i==0){ // completely dividing
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){ // true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        primesInRange(100);
    }
}