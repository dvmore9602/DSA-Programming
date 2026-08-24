
import java.util.*;

public class AreaParameterGreater {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr the length :");
    int length = sc.nextInt();
    System.out.println("Enter the  breadth :");
    int breadth = sc.nextInt();
    int Area = length * breadth;
    int perimeter = 2 *(length + breadth);

    //   formula of Area = Lenght * breadth
    //   and perimeter = 2 * (length + breadth)

    if(Area > perimeter){
        
        System.out.println(" Area is greater then perimeter");
    }
    if (perimeter > Area){
        System.out.println("perimter is greter the Area");
    }
   if( perimeter == Area){
    System.out.println("Area And Perimeter are equal");
   }
    }
    
}
