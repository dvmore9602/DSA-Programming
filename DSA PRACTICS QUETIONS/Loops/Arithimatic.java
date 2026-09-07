import java.util.Scanner;

public class Arithimatic {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        // for( int i=1; i<=2*n-1; i=i+2){

        
        // System.out.println(i + " ");
        // }


    // 4,7,11,13,16.....


    //     for(int i=1; i<=3*n-1; i++){
    //         System.out.println(i + " ");
    //     }
        


    // for(int i =4 ;i<=3*n-1; i++){
    //     System.out.println( i +"");
    // }
    //Geomatric problem  1,2,4,8,16,32.....n term
   
    int a=1, r =2;
    for(int i =1; i<=n ; i++){

    
        System.out.println(a+ " ");
         a *= r;
    }
}

    
}
