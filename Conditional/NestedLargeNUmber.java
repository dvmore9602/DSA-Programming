import java.util.*;

public class NestedLargeNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number a :");

        int a = sc.nextInt();
        System.out.println("Enetr the number b :");

        int b = sc.nextInt();
        System.out.println("Enetr the number c :");
        int c = sc.nextInt();
        if(a > b){
            if(a > c){
                System.out.println( a + " is the larger");

            }
        }
        else{
            System.out.println( c +" is not larger ");

        }
        if (b > c){
            System.out.println(  b + " is larger ");
        }
        else{
            System.out.println(c+ "is not larger ");
        }

    }
    
}
