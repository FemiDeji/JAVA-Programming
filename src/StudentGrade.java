import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int marks[] = new int[9];
        float total = 0, avg;
        for (i = 0; 1 <= 9; i++) {

            System.out.println("Enter mark of subject" + (i + 1) + ":");
            marks[i] = sc.nextInt();
            total = total + marks[i];

            //Calculating the student's average
            avg = total / 9;
            if (avg <= 0) {
                System.out.println("Invalid Entry");
            } else if (avg >= 70 & avg <= 100) {
                System.out.println("A");
            } else if (avg >= 60 & avg <= 69) {
                System.out.println("B");
            } else if (avg >= 50 & avg <= 59) {
                System.out.println("C");
            } else if (avg >= 45 & avg <= 49) {
                System.out.println("D");
            } else if (avg >= 0 & avg <= 49) {
                System.out.println("F");
            }
        }
    }
}