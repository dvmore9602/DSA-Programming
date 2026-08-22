import java.time.Year;
import java.util.*;

public class LeapYearOrNOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the years : ");
        int years = sc.nextInt();
        if(years%400==0 || (years % 100!=0 && years % 4==0)){
            System.out.println("this is the leap year ");
        
        }
        else{
            System.out.println("this is not leap years  ");
        }
    } 
}
