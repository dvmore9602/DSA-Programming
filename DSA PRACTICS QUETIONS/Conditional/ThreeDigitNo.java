import java.util.*;
public class ThreeDigitNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =  sc.nextInt();
        if(num >99 && num <1000){
            System.out.println("This is the three digit ");
        }
        else{
            System.out.println("This is not three digit ");
        }

    }
}
    

