import java.util.*;
public class XandYaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        if( x==0 && y ==0 ){
            System.out.println("The point is origin");

        }
        else if(x==0){
            System.out.println("The point lies on y-axis");

        }
        else if (y==0){
            System.out.println("The point lies in x-axis");
        }
        else{System.out.println("the codition is lies ");}
    }
    
}
