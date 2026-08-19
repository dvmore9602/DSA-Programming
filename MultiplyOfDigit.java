import java.util.*;
public class MultiplyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        
        int n = sc.nextInt();
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;

        }
    }
    
}
