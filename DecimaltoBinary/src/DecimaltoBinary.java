import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, i=0;
        int binary[]= new int[100];

        System.out.println("Enter binary number");
        number = .nextInt();

        while(number!=0) {

        }
        binary[i]=number%2;
        number = number/2;

        System.out.print("print binary value");



    }

}
