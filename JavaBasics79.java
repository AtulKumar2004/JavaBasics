// code to convert from binary to decimal and decimal to binary
public class JavaBasics79 {
    public static void binToDec(int binNum) {
        int myNum=binNum;
        int decNum=0,lastDig,pow=0;

        while (binNum>0){
            lastDig=binNum%10;
            decNum=decNum+(lastDig*(int)Math.pow(2,pow));
            binNum=binNum/10;
            pow++;
        }

        System.out.println("decimal of "+myNum+" = "+decNum);
    }
    public static void decToBin(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of "+myNum+" = "+binNum);
    }
    public static void main(String args[]) {
        decToBin(8);
    }
}