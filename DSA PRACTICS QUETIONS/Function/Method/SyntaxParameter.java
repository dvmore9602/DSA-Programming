import java.util.*;
public class SyntaxParameter {
    public static int  calculatesum ( int Num1 , int Num2){
        // parameter or formal parameters
        int sum = Num1 + Num2;
        return sum;
    
    }
  
    public static void main(String[] args) {
        // Argument or Actual parameters
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

         int sum =calculatesum(a , b);
            System.out.println("sum is : " + sum);

        
    }
}