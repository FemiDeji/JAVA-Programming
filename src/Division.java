import java.util.Scanner;
public class Division {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows in the first matrix");
        int row1 = sc.nextInt();

        System.out.println("Please enter the number of columns in the first matrix");
        int col1 = sc.nextInt();

        System.out.println("Please enter the number of rows in the second matrix");
        int row2 = sc.nextInt();

        System.out.println("Please enter the number of columns in the second matrix");
        int col2 = sc.nextInt();

        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];

        System.out.println("Please enter the data of matrix A: \n ");
        for (int i = 0; i <row1; i++){
            for (int j = 0; j <col1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Please enter the data of matrix B: \n ");
        for (int i = 0; i <row2; i++){
            for (int j = 0; j <col2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        //matrix division
        System.out.println("Matrix division is: \n ");
        for (int i = 0; i <row1; i++){
            for (int j = 0; j <col2; j++){
                c[i][j] = a[i][j] / b[i][j];
            }
        }
        //printing the matrix
        for (int i = 0; i <row1; i++){
            for (int j = 0; j <col2; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
