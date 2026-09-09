import java.util.Scanner;

public  class Marks {

    public static void main(String[] args) {
        int[]marks= new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("Phy :" + marks[0]);
        System.out.println("Chem : " + marks[1] );
        System.out.println("maths :" + marks[2]);
        System.out.println("Marathi : " + marks[3]);
        // marks[1] = 100;
        // System.out.println("Chem : " + marks[1]);
        int percentage = (marks[0]+ marks[1]+ marks[2] + marks[3])/4;

        System.out.println("percentage: " + percentage + "%");




    }
}