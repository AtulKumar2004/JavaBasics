// solid rhombus pattern
import java.util.*;
public class JavaBasics65 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of stars you want in solid rhombus pattern: ");
        int stars=sc.nextInt();
        System.out.print("Enter number of lines you want in solid rhombus pattern: ");
        int line=sc.nextInt();
        // method 1:
        // int change=line;
        // int col=stars+line-1;
        // for(int i=1; i<=line; i++){
        //     for(int j=1;j<=col;j++){
        //         System.out.print(j>=change?"*":" ");
        //     }
        //     col--;
        //     change--;
        //     System.out.println();
        // }
        
        // method 2:
        for(int i=1;i<=line;i++){
            // spaces
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}