// l5 q2
import java.util.*;
public class JavaBasics86 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int evensum=0;
        int oddsum=0;
        int choice=1;
        int n;
        for(;choice==1;){
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            if (n%2==0) {
                evensum=evensum+n;
            }
            else{
                oddsum=oddsum+n;
            }
            System.out.print("Enter 1 to continue or any other key to exit: ");
            choice=sc.nextInt();
        }
        System.out.println(evensum+" is the sum of even numbers");
        System.out.println(oddsum+" is the sum of odd numbers");
    }
}
