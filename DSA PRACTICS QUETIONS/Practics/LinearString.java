public class LinearString {
    public static void main(String[] args) {
        
        String arr[] = {"Dnyanu", "Sid","Yash","Ananta"};
        String search= "Sid";

        for(int i=0; i<arr.length; i++){
            if (arr[i] == search){
                System.out.println("Name is found :" +i);
                  return;

            }
        }
        System.out.println("Name is not found: ");
        
    }
    
}
