// check if a number is prime or not
import java.util.*;
public class JavaBasics50 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        if (n==1 || n==0){
            System.out.println(n+" is neither prime nor composite");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0){
                    isPrime=false;// n is a multiple of i (where i not equal to 1 or n)
                }
            }
            if(isPrime==true){
                System.out.println(n+" is prime");
            }
            else{
                System.out.println(n+" is not prime");
            }
        }
    }
}