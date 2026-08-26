import java.util.*;
public class ThreePositiveInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the values of a :");
        int a = sc.nextInt();
        System.out.println("Enter the values of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();
         
        if(a > b && a > c){
            System.out.println(a + "A is greatest");
        }
        else if(b > a && b > c){
            System.out.println(b + "b is Greatest ");

        }
        if(c > a && c>b){
            System.out.println(c + "c is gratest");
        }
        
    }
}