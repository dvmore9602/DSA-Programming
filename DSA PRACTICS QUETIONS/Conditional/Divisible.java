import java.util.*;
public class Divisible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num % 5 ==0 && num % 3 ==0){
            System.out.println("This is the divisible by 5 And 3 ");

        }
        else{
            System.out.println("This is not the divisible by 5 And 3");
        }
    }

} 