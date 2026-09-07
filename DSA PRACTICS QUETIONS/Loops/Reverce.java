public class Reverce {

    public static void main(String[] args) {
        int n = 9062002;
        while (n>0) {

        int last_Digit = n%10;
        System.out.print(last_Digit + "");
        n= n/10;
        }

    }
}