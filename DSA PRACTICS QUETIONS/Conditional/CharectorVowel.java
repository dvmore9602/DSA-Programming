import java.util.*;


    
    public class CharectorVowel {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Vowel :");
               char ch= sc.next().charAt(0);
            if ( ch == 'a'|| ch == 'e'||  ch =='i' || ch == 'o' || ch =='u'){
                System.out.println("this is the vowel");

            }
            else{
                System.out.println("this is not vowel");
            }
        }
    }
