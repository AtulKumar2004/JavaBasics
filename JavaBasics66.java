// Hollow Rhombus Pattern
import java.util.*;
public class JavaBasics66 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of stars you want in hollow rhombus pattern: ");
        int stars=sc.nextInt();
        System.out.print("Enter number of lines you want in hollow rhombus pattern: ");
        int line=sc.nextInt();
        // method 1:
        // int change=line;
        // int col=stars+line-1;
        // for(int i=1; i<=line; i++){
        //     for(int j=1;j<=col;j++){
        //         if(i==1 || i==line ){
        //             System.out.print(j>=change?"*":" ");
        //         }
        //         else{
        //             System.out.print(j==change || j==col?"*":" ");
        //         }
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
                System.out.print((j==1 || i==1 || j==stars || i==line)?"*":" ");
            }
            System.out.println();
        }
    }
}