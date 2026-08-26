import java.util.*;
public class VotingEligible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("voting Eligible ");

        }
        else{
            System.out.println("Not Eligible");
        }
    }
}