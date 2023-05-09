import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("PLease Enter Decimal Number:");
//        int k = sc.nextInt();
//        System.out.println("The binary equivalent of " + k + " is: ");
//        System.out.println(Integer.toBinaryString(k));

//        System.out.println();

        System.out.println("Enter Binary Number: ");
        String s = sc.next();
        System.out.println("The Decimal Equivalent of " + s + " is: ");
        System.out.println(Integer.parseInt(s,2));



    }
}
