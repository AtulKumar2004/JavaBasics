// l7 q5
public class JavaBasics85 {
    public static int computeSumofDigits(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
        
    public static void main(String args[]) {
        System.out.println("Sum of digits: "+computeSumofDigits(4528));
    }
}
