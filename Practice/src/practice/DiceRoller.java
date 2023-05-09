package practice;

//import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;
//public class Practice{
    //private static Object name;
    //public static void main(String[] args){
 
 /*        IF ELSE STATMENT
        int temp = 90;
        
        if(temp >=100){
            System.out.println("The temperature is very hot outside");
        }
        else if(temp <70 && temp <=110){
            System.out.println("It is warm outside");
        }    
        else {
            System.out.println("It is cold outside");
        }
       
        Scanner sc = new Scanner(System.in);
 
//      LOGICAL OPERATORS = "+", "-", "!", "/".
        System.out.println("Do you want to exit the game? Press Y or N to exit");
        String response = sc.next();
      
        if(!response.equals("Y") && !response.equals("N") ){
            System.out.println("You are still in the game");         
        }
        else {
            System.out.println("You quit the game");
        }
        
        String name = "";
        //WHILE LOOP: It executes a block of code as long as it remains true
        while (name){
            System.out.println("Enter your name: ");
            name = sc.nextLine();
            System.out.println("Hello" +name);
        
        //FOR LOOP: It executes a block of code as long a limited number of times
            for( int i=20; i>2; i-=2){
            System.out.println(i);
            }
            System.out.println("Happy New Year");

        //NESTED LOOP: It is a loop inside another loop
        Scanner sc =  new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        
        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        
        System.out.println("Enter number of columns: ");
        columns = sc.nextInt();
        
        System.out.println("Enter your preffered symbol: ");
        symbol = sc.next();
        
        for(int i=3; i<=rows; i++){
            System.out.println();
            for(int j=3; j<=columns; j++){
            System.out.print(symbol);
        }
        }
  
        //ARRAY: It is used to store multiple variables in a single variable
        String[] cars = {"Benz", "Ferrari", "Lamborghini", "Chervolet"};
        //cars [1] = "Audi";
        System.out.println(cars[3]);
         
        String[] cars = new String[4];
        cars[0] = "Bugatti";
        cars[1] = "Tesla";
        cars[2] = "BMW";
        cars[3] = "Ford";
       
        for(int i=0; i<=3; i++){
          System.out.println(cars[i]);  
        }
        
    
        String[] profile = new String[5];
        profile[0] = "My name is Adeniyi Oluwafemi Ayodeji";
        profile[1] = "I am studying at Adeleke University Ede";
        profile[2] = "I am a 200L student";
        profile[3] = "I am a Computer Science student";
        profile[4] = "I love programming";
        
        //for(int i=0; i<4; i++){
            System.out.println(profile[0] + profile[1] + profile[2] + profile[3] + profile[4]+" ");
        }
 
        //2D ARRAY: It is an array of arrays
        String cars[][] = new String[3][3];
        cars[0][0] = "Benz";
        cars[0][1] = "Ford";
        cars[0][2] = "Ferrari";
        cars[1][0] = "Bugatti";
        cars[1][1] = "Avantador";
        cars[1][2] = "Cardillac";
        cars[2][0] = "Audi";
        cars[2][1] = "G-wagon";
        cars[2][2] = "Escalade";

        String cars[][] = {
                            {"Benz", "Ford", "Ferrari"} , 
                            {"Bugatti", "Avantador", "Cardillac"} , 
                            {"Audi", "G-Wagon", "Escalade"}
                           };
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
        }

        //STRING: Its a reference dagta types that can store one or more characters
                  //Reference data types have access to useful methods
        String school = "Adeleke University";
        boolean result = school.equals("Adeleke University");
        
        System.out.println(result);

        String name = "Femi";
        int result = name.length();
        int result = name.indexOf("0");
        char result = name.charAt(2);
        boolean result = name.isEmpty();
        String result =  name.toUpperCase();
        String result = name.toLowerCase();
        String result = name.trim();
        String result = name.replace('o','a' );
        
        System.out.println("Hello " +result);

            // WRAPPER CLASS = PROVIDES A WAY TO USE PRIMITIVE DATA TYPES AS REFERENCE DATA TYPES
                             //REFERENCE DATA TYPES CONTAIN USEFUL METHODS
                             //CAN BE USED WITH COLLECTIONS(E.g.ARRAYLIST)
            //AUTOBOXING = ITS THE AUTOMATIC CONVERSION THAT THE JAVA COMPILER MAKES BETWEEN THE PRIMITIVE TO THE CORRESPONDING WRAPPER CLASS
            //UNBOXING = ITS THE REVERSE OF AUTOBOXING. AUTOMATIC CONVERSION OF WRAPPER CLASS TO PRIMITIVE
        
        Boolean a = true;
        Character b = '&';
        Integer c = 123;
        Double d = 5.676;
        String e = "Rabbii";
        
        if(b=='&'){
            System.out.println("This is true");
        }

             //ARRAYLIST = A RESIZEABLE ARRAY. ITS STORES REFERENCE DATA TYPES
                         //ELEMENTS CAN BE ADDED AND REMOVED AFTER COMPILATIOLN PHASE
        ArrayList<String> food = new ArrayList<String>();
        food.add("Shawama");
        food.add("Pizza");
        food.add("Ice-cream");
        food.add("Donut");
        food.add("Mocktail");
        
        food.set(2, "Parfait");
        food.remove(3);
        food.clear();
        
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

                     //2D ARRAYLIST = A DYNAMIC LISTS OF LISTS
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        
        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tatase");
        produceList.add("Onions");
        
        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Bigi");
        drinksList.add("Fanta");
        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        System.out.println(groceryList.get(2).get(0));

            //FOR EACH LOOP = ITS A TRAVERSING TECHNIQUE TO ITERATER THROUGH THE ELEMNTS IN AN ARRAY
        //String[] animals = {"Lion", "Dog", "Chicken", "Goat", "Eagle"};
        ArrayList<String> animals = new ArrayList<String>();
        
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Chicken");
        animals.add("Goat");
        animals.add("Eagle");
        
        for(String i : animals) {
            System.out.println(i);
        }

              //METHOD: IS A BLOCK OF CODE THAT IS EXECUTED WHEN IT IS CALLED UPON
        String name = "Adeniyi Oluwafemi";
        int age = 20;
        hello(name, age);
    }
        static void hello(String name, int age){
            
            
            System.out.println("Hello "+name   );
            System.out.println("You are "+age+ "yrs old");

         
        int x = 1000;
        int y = 20;
        int z = divi(x, y);
        System.out.println(z);
    }
        static int divi(int x, int y){
            int z = x / y;
            return z;
        }

        //OVERLOADED METHOD: THESE ARE METHODS THAT SHARE THE SAME NAME BUT HAVE DIFFERENT PARAMETERS
        double x = sub(9.5, 7.1, 1.6);
        System.out.println(x);
    }
    static int sub(int a, int b){
        System.out.println("This is overloaded method 1: ");
        return a - b;
    }
    static int sub(int a, int b, int c){
        System.out.println("This is overloaded method 2: ");
        return a - b - c;
    }
    
    static int sub(int a, int b, int c, int d){
        System.out.println("This is overloaded method 3: ");
        return a - b - c - d;
    }
    static double sub(double a, double b, double c){
        System.out.println("This is overloaded method 6: ");
        return a - b - c;
    }
    static double sub(double a, double b, double c, double d){
        System.out.println("This is overloaded method 7: ");
        return a - b - c - d;

             //PRINTF(): ITS AN OPTIONAL METHOD TO CONTROL, FORMAT, AND DISPLAY TEXT TO THE CONSOLE WINDOW
        //System.out.printf("%d: This is a format string", 546);
        //String name = "Ayodeji";
        double cash = 1000000000;
        System.out.printf("I have this amount of money %,f", cash);
        //System.out.printf("Hello %30s", name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius r of the circle");
        
        float r = sc.nextFloat();
        double area, circumference;
        double pi = 3.142;
        area = 2 * pi * r;
        circumference = pi * pi * r;
        System.out.println("The area of the circle is: " +area);
        System.out.println("The circumference of the circle is: "+circumference);

        final double pi = 3.14159;
        System.out.println(pi);
         }
}
                //OBJECTS: THEY ARE AN INSSTANCE OF A CLASS THAT MAY CONTAIN CERTAIN ATTRIBUTES AND METHODS
public class Car{
    
    String brand = "Mercedes";
    String model = "G-Wagon";
    int year = 2023;
    double price = 40000;
    String color = "Blue";

    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You stepped on the brakes");
        }
    public static void main(String [] args){
       Car myCar1 = new Car();
       Car myCar2 = new Car();
       
       System.out.println(myCar1.brand);
       System.out.println(myCar1.color);
       System.out.println();
       System.out.println(myCar2.model);
       System.out.println(myCar2.price);
       //System.out.println(myCar.year);
       myCar.brake();
    }
}

public class Human {

    String name;
    int age;
    String nationality;
    String Origin;
    double height;
    
    Human(String name, int age, String nationality, String Origin, double height){
    this.name = name;
    this.age = age;
    this.nationality = nationality;
    this .Origin = Origin;
    this.height = height;
    }
    void eat(){
     System.out.println(this.name +" is eating");   
    }
    void drink(){
        System.out.println(this.name+ " is drinking");
    }
    public static void main(String[] args){
        Human human1 = new Human("Femi", 20, "Nigerian", "Ondo", 6.2);
        Human human2 = new Human("Deino", 19, "Portugese", "Portugal", 5.9);
        
        //System.out.println(human2.name);
        human2.drink();
    }
}
*/
public class DiceRoller {
   DiceRoller(){
       
       Random random = new Random();
       int number = 3;
       roll(random, number);
   }
   void roll(Random random, int number){
       number = random.nextInt(6)+2;
       System.out.println(number);
   }
    public static void main(String [] args){
        DiceRoller diceroller = new DiceRoller();
        
    }
}
   




    

  


    
   
