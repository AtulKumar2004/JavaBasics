// function overloading using data types
public class JavaBasics77 {
    // function to calculate integer sum
    public static int sum(int a,int b){
        return a+b;
    }
    // function to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]) {
        System.out.println(sum(4,60));
        System.out.println(sum(2.31f,4.21f));
    }
}