// l7 q2
import java.util.*;
public class JavaBasics82 {
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean iseven=isEven(n);
        if (iseven){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
