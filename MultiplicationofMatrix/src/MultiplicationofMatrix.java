import java.util.Scanner;

public class MultiplicationofMatrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows in first matrix");
            int rowsInFirst = sc.nextInt();

            System.out.println("Enter number of columns in first matrix or rows in second matrix columns");
            int colsInFirstAndRowsInSecond = sc.nextInt ();

            System.out.println("Enter the number of columns in the second matrix");
            int colsInSecond = sc.nextInt();

            int matrix1[][] = new int[rowsInFirst][colsInFirstAndRowsInSecond];
            int matrix2[][] = new int[colsInFirstAndRowsInSecond][colsInSecond];
            int product[][] = new int[rowsInFirst][colsInSecond];

            System.out.println("enter the data for first matrix:");

            for (int i = 0; i < rowsInFirst; i++) {
                for (int j = 0; j < colsInFirstAndRowsInSecond; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter the data for second matrix:");

            for (int i = 0; i < colsInFirstAndRowsInSecond; i++) {
                for (int j = 0; j < colsInSecond; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            System.out.println("print first matrix");
            for (int i = 0; i < rowsInFirst; i++) {
                for (int j = 0; j < colsInFirstAndRowsInSecond; j++) {
                    System.out.println(matrix1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("print second matrix");
            for (int i = 0; i < colsInFirstAndRowsInSecond; i++) {
                for (int j = 0; j < colsInSecond; j++) {
                    System.out.println(matrix2[i][j] + " ");
                }
                System.out.println();
            }

            //get the product;
            for (int i = 0; i < rowsInFirst; i++) {

                for (int j = 0; j < colsInSecond; j++) {

                    for (int k = 0; k < colsInFirstAndRowsInSecond; k++) {
                        product[i][j] += matrix1[i][k] = matrix2[k][j];
                    }
                }
            }

            //print the final product:
            System.out.println("product of two matrices");
            for (int k = 0; k < colsInFirstAndRowsInSecond; k++) {
                product[i][j] += matrix1[i][j] * matrix2[i][j];
                System.out.println(product[i][j] +" ");
            }
            System.out.println();
        }
    }



