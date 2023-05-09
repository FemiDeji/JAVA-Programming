import java.util.Scanner;
public class Matrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter total number of columns");
        int cols = sc.nextInt();

        int data[][] = new int[rows][cols];

        System.out.println("Enter matrix data here");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        //print matrix data
        System.out.println("Matrix data is: \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
