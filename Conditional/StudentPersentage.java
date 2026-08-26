import java.util.*;
public class StudentPersentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the persentage :");
        int persentage = sc.nextInt();
        if(persentage > 90){
            System.out.println("Excellent");
        }
        else if (persentage > 80){
            System.out.println("Very Good");
        }
        else if(persentage > 70){
            System.out.println("Good");
        }
        else if (persentage > 60){
            System.out.println("Can do better");
        }
        else if (persentage > 50){
            System.out.println("Avarage");
        }
        else if (persentage > 40){
            System.out.println("Below avarage");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
