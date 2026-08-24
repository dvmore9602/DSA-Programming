import java.util.*;

public class CostSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Selling Price : ");
        int SellingPrice = sc.nextInt();
         System.out.println("Enter Cost price : ");
        int CostPrice = sc.nextInt();
        
        if (SellingPrice > CostPrice ){
            int profit = SellingPrice - CostPrice;
            System.out.println("you  made a profit ");
            System.out.println("profit : " + profit);

        }
        else if (SellingPrice< CostPrice){
            int loss = CostPrice - SellingPrice;
            System.out.println("you made a loss ");
            System.out.println("loss " + loss);

        }
        else {
            
            System.out.println("No Profit , No Loss");
        }

    }
    
}
// SP > CP  → Profit
// SP < CP  → Loss
// SP = CP  → No Profit No Loss
