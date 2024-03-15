// print reverse of a number
public class JavaBasics43 {
    public static void main (String args[]){
        int n=2234;
        while(n>0){
            int lastdig=n%10;
            System.out.print(lastdig);
            n=n/10;
        }
        System.out.println();
    }
}