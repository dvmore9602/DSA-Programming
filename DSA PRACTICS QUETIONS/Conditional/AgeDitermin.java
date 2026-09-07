import java.util.*;
public class AgeDitermin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of ram :");
        int ram = sc.nextInt();
        System.out.println("Enetr the age of shyam :");
        int shyam = sc.nextInt();
        System.out.println("Enter the age of ajay :");
        int ajay = sc.nextInt();
        if(ram > shyam){
            if(ram > ajay){
            System.out.println(ram + "ram is youngest of shyam and ajay");
            
            }
        else{
            System.out.println(ajay + " is youngest ");

        }
        }
        if (shyam > ajay){
            System.out.println(shyam + " is youngest of ram and ajay");

        }
        else{
            System.out.println(ajay + "is youngest ");
        }

        }
        
    }
