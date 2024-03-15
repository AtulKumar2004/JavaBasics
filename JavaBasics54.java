// l5 q4
import java.util.*;
public class JavaBasics54 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number whose multiplication table is to be displayed: ");
        int num=sc.nextInt();
        int i;
        for (i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
              
        }
    }
    
}
