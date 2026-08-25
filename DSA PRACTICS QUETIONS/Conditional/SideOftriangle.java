import java.util.*;
public class SideOftriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c ");
        int c = sc.nextInt();
        if(a + b > c && b + c > a && c + a > b ){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Not Valid Triangle");
        }

    }
};