import java.util.*;
public class WhileInfiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rang = sc.nextInt();
        int counter =1;
        while (counter<=rang){
            System.out.print(counter + " ");
            counter++;


        }
        System.out.println();
    }
    
}
