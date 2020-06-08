
//    Abstract Class
   abstract class Shape {
       String color;
//       Abstract Class Method
//    abstract double area(a,b);
    public abstract String toString();

    //  Abstract Class can have constructor
    public Shape (String color) {
        this.color = color;
        System.out.println("Shape Constructor called");
    }

//    Concrete method
    public String getColor () {
        return color;
    }
   }

/* class Circle extends Shape {
     @Override
     double area(a , b) {
         return a+b;
     }
 }*/





public class polymorphismApp {

    //     polymorphism allows you to define one interface and have multiple implementations
    public static void main (String[] args) {
        System.out.println("Polymorphism Class");
    }
            /*

          1.  An abstract class is a class that is declared with abstract keyword.
          2.  An abstract method is a method that is declared without an implementation.
          3.  An abstract class may or may not have all abstract methods. Some of them can be concrete methods
          4.  A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
          5.  Any class that contains one or more abstract methods must also be declared with abstract keyword.
          6.  There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
          7.  An abstract class can have parametrized constructors and default constructor is always present in an abstract class.


                    When to use abstract classes and abstract methods with an example


            */

}
