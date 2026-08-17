import java.util.*;
public class Linear{
    public static int linearSearch2(int numbers[], int key){

        for (int i=0; i<numbers.length; i++){

            if(numbers[i] == key){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={2, 4, 8 , 10 , 12 , 14 , 16 , 18};
        int key = 36;
        int index = linearSearch2(numbers, key);
        if (index == -1){
            System.out.println("NOT FOUND");

        }
        else{
            System.out.println("key is at index :" + index);
        }
        
        }

        
    }

