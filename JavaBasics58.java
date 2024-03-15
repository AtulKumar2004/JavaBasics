// print character pattern
public class JavaBasics58 {
    public static void main(String args[]) {
        char ch='A';
        int n=4;
        // outer loop
        for (int line=1;line<=n;line++){
            // inner loop
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
    }
}
