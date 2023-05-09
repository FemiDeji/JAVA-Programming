import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        /*
        switch (value){
            case 1:
                //expressions
                break;
            case 2:
                //expressions
                break;
            case 3:
                //expressions
                break;
            default:
                //expression
          }
         */
//        int number = 1;
//
//        switch (number){
//            case 1:
//                System.out.println("number is one");
//            case 2:
//                System.out.println("number is two");
//                break;
//            case 3:
//                System.out.println("number is three");
//                break;
//            default:
//                System.out.println("number not found");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = sc.nextInt();

        switch (grade / 10) {
            case 1:
            case 2:
            case 3:
                System.out.println("F");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("C");
                break;
            case 6:
            case 7:
                System.out.println("B");
            case 8:
            case 9:
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        ;
    }
}
//}
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter emotion");
//        int emotion = 8;
//        switch (emotion) {
//            case 1:
//                System.out.println("I am Happy");
//                break;
//            case 2:
//                System.out.println("I am Sad");
//                break;
//            case 3:
//                System.out.println("I am Angry");
//                break;
//            case 4:
//                System.out.println("I am Suprised");
//                break;
//            default:
//                    System.out.println("Unknown Emotions");
//
//
//        };
//    }
//}
//                 Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of student");
//        int student = sc.nextInt();
//                 for (int i = 1; i <=student; i++){
//                         System.out.println("Welcome to Femi's coding playground");
//
//                     }
//
//                 }
//    }
