import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows in first matrix ");
        int row1 = sc.nextInt();

        System.out.println("Enter number of columns in first matrix");
        int col1 = sc.nextInt();

        System.out.println("Enter number of rows in second matrix");
        int row2 = sc.nextInt();

        System.out.println("Enter number of columns in second matrix");
        int col2 = sc.nextInt();

        //if (col1 != row2) {
        // System.out.println("Matrix multiplication is not possible");
        //} else {
        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];
        System.out.println("Please enter data for matrix A : \n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Please enter data for matrix B : \n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        //matrix multiplication
        System.out.println("Matrix multiplication is : \n");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                c[i][j] = a[i][j] * b[j][j];
            }
        }
        //printing out the matrix
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
