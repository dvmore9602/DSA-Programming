import java.util.*;
public class YoungestPerson{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of ram ");
        int  ram = sc.nextInt();
        System.out.println("Enter the age of Shyam");
        int shyam = sc.nextInt();
        System.out.println("Enter the age of Ajay");
        int ajay = sc.nextInt();

        if(ram > shyam && ram > ajay ){
            System.out.println(ram  + "largest to all");

        }
        else if(shyam > ram && shyam > ajay){
            System.out.println(shyam  + "youngest");
        }
        else{
            System.out.println(ajay + "Greatest");
        }


    }
}