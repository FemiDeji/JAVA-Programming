import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Degree in fahrenheit");
        double degree = sc.nextDouble();


        double  celsius = ((degree  -32)*5)/9;
//        fahrenheit = (1.8 * degree)+32;
        System.out.println("Degree in celsius is " + celsius);
//      System.out.println("Degree in fahrenheit is " + fahrenheit);
    }
}


