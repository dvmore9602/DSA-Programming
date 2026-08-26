 import java.util.*;
 public class NestedThreeFive {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbar :");
        int num = sc.nextInt();
//         if (num % 5 == 0 || num % 3 == 0){
//             if(num % 15 !=0){
//                 System.out.println("This is the divisible by both  3 and 5  but not fifteen");

//             }
//         }

//         else{
//             System.out.println("Not divisible by 3 and 5");
//         } 
             
//     
    
//  

if(num % 5 == 0 || num % 3 == 0 && num % 15 !=0){
    System.out.println("this is the numbers of didvisible by 3 and 5 but not fifteen ");

}
else{
    System.out.println("Not divisible ");
}
    }
}   
    

