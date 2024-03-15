// reverse the given number
public class JavaBasics44 {
    public static void main (String args[]){
        int n=10899;
        int lastdig;
        int rev=0;
        while (n>0){
            lastdig=n%10;
            rev=(rev*10) + lastdig;
            n=n/10;
        }
        System.out.println(rev);
    }
}