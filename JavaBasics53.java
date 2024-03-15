// l5 q3
import java.util.*;
public class JavaBasics53 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number whose factorial is to be found: ");
        int num=sc.nextInt();
        int i;
        int fac=1;
        for(i=1; i<=num; i++){
            fac=fac*i;

        }
        System.out.println("The factorial of "+num+" is "+fac);
        
    }
    
}
