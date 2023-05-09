import java.util.Scanner;
public class CreatingaMatrix {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in the first matrix");
        int row1 = sc.nextInt();
        
        System.out.println("Enter number of columns in the first matrix ");
        int col1 = sc.nextInt();
        
        System.out.println("Enter number of rows in the second matrix");
        int row2 = sc.nextInt();
        
        System.out.println("Enter number of columns in the second matrix");
        int col2 = sc.nextInt();
        
        
        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];
        
        System.out.println("Enter matrix data for A: \n");
        
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix data for B: \n ");
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        //matrix addition
        System.out.println("Matrix additon is: \n");
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //printing out the matrix
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                System.out.print(c[i][j] + "\t ");
            }
            System.out.println();
        }
       
    }
}

