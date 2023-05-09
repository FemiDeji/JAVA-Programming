import java.util.Scanner;
public class AreaAndCircum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the radius");
        float radius = sc.nextInt();
        double area, circum;

        area = (22/7 * radius * radius);

        circum = (2 * 22/7 * radius);

        System.out.println("area of circle is:" + area);
        System.out.println("circumference of circle is:" + circum);

    }
}
