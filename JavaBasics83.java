// l7 q3
import java.util.*;
public class JavaBasics83 {
    public static boolean isPalindrome(int n){
        int myNum=n;
        int r=0;
        while(n>0){
            int ld=n%10;
            r=r*10+ld;
            n=n/10;
        }
        if(r==myNum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n+" is palindrome");
        }
        else{
            System.out.println(n+" is not palindrome");
        }
    }
}