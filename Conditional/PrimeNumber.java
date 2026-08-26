import java.util.*;
public class PrimeNumber{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = sc.nextInt();
    if(num %1==0 && num % 2 !=0 ){
        System.out.println("This is prime Number ");

    }
    else{
        System.out.println("This is not prime Number ");
    }

}
    

}