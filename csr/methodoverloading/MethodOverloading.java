
/*package methodoverloading;

class MethodOverloading {
    static int add(int a, int b) 
    {return a + b; }
    static int add(int a, int b, int c) 
    {
        return a + b + c;
    }
    
    static double sub(double x, double y) 
    {return x - y;}
    static double sub(double x, double y, double z)
    {
        return x - y - z;
    }
    
    static float multi(float d, float e) 
    {return d * e;}
    static float multi(float d, float e, float f)
    {
        return d * e * f;
    }
    
    static double divi(double j, double k) 
    {return j / k;}
    static double divi(double j, double k, double L)
    {
        return j / k / L;
    }
            
    public static void main(String args[]){
        System.out.println("add() using 2 values is:");
        System.out.println(add(4, 6));
        System.out.println("add() using 3 values is:");
        System.out.println(add(4, 6, 7));
        
        System.out.println("sub() using 2 values is:");
        System.out.println(sub(10.97, 5.46));
        System.out.println("sub() using 3 values is:");
        System.out.println(sub(10.97, 5.46, 2.83));
        
        System.out.println("multi() using 2 values is:");
        System.out.println(multi(20.984764f, 15.839734f));
        System.out.println("multi() using 3 values is:");
        System.out.println(multi(20.984764f, 15.839734f, 10.895075f));
        
        System.out.println("divi() using 2 values is:");
        System.out.println(divi(15.21, 10.55));
        System.out.println("divi() using 3 values is:");
        System.out.println(divi(15.21, 10.55, 7.89));
    }

   
    }

//SUPERCLASS
class Car{
   // METHOD AND FIELD OF THE PARENT CLASS
    String name;
    void drive(){
        System.out.println("The model of the car is: "+name);
    }
}
//SUBCLASS INHERITING FROM CAR
class Benz extends Car{
    //NEW METHOD IN THE SUBCLASS
    void brake(){
        System.out.println("I am driving the car");
    }
}
class Main {
    public static void main(String[] args){
        //OBJECT OF THE SUBCLASS
      Car hybrid = new Car();
      //ACCESS FIELD OF THE SUPERCLASS
      hybrid.name = "G-Wagon";
      //CALLING THE METHOD OF THE SUBCLASS
      //USE OF OBJECT OF THE SUBCLASS
      hybrid.drive();
    }
}
*/
class Student {
    String name, course;
    void field(){
       System.out.println("My name is " +name +"I am a "+course +"student"); 
    }
    class Level{
        void study(){
            System.out.println("I am a 200L student");
        }
    }
    class Department {
        public void main(String[] args){
            Student school = new Student();
            school.name = "Odemuyiwa Oladele";
            school.course = "Computer Science";
            school.field();
    }
}
    

    

