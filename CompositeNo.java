import java.util.Scanner;

public class CompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false; // flase means prime no
        for(int i =2 ; i<n; i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        System.out.println("Composite no");
        System.out.println("prime no");
    }
    
}
