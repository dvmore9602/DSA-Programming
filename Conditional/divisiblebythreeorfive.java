import java.util.*;
public class divisiblebythreeorfive{
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the number :");
   int num  = sc.nextInt();
    if (num% 3 ==0 || num % 5 == 0){
        System.out.println("this numbaer is divisible by 3 or 5");
    }
    else {
        System.out.println("this number is not divisible by 3 or 5");
    }
   
        
    }
    }
