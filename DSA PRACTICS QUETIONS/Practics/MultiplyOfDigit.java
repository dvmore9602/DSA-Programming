import java.util.*;
public class MultiplyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiply = 1;
        while (n>0) {
            int lastDigit =n%10;
            multiply = multiply * lastDigit;
            System.out.println(multiply);

        }
    }
    
}
