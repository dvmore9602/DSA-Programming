import java.util.*;
public class PrintOnetoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the n :");
        int n =sc.nextInt();

        for(  int i=1; i<=n ; i++){
            System.out.println(i);
        }
    }
}