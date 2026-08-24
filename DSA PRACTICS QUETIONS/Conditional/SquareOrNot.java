import java.util.*;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh length : ");
        int lenght = sc.nextInt();
        System.out.println("Enter the Breadth");
        int breadth = sc.nextInt();
        if(lenght == breadth){
            System.out.println("this is the square");
        }
        else{
            System.out.println("this is not square");
        }

    }
    
}
