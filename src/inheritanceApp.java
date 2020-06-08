
//Textual Representation how an object will look like in the memory
//Whatever we write in class is actual the property of the object as we describing the object
// If you want anything which should belong to class make it static  !!
class Product {
    // Attribute (State)
    private int pid;
    String name;
    int price;

    //    constructor
    Product() {
        System.out.println(">> Product Object Construted");
    }

    //    Methods(Behaviour)
    void setProductDetails(int pid1, String name1, int price1) {
        this.pid = pid1;
        this.name = name1;
        this.price = price1;
        System.out.println(">> Data Written in  product Object");
    }


  /*  void setProductDetails(int pid, String name) {
        this.pid = pid;
        this.name = name;
        System.out.println(">> Data Written in  product Object");
    }*/

    //    To read data
    void showProductDetails() {
        System.out.println("product id:" + pid);
        System.out.println("Name:" + name);
        System.out.println("price:" + price);
    }

    //    setter is required when attribute is marked as private
    void setPid(int pid) {
        this.pid = pid;
    }

    int getPid() {
        return pid;
    }
    public static void main(String[] args) {
        Product myProduct2 = new Product();
        myProduct2.setProductDetails(100000, "DELL_LATITUDE,", 555555);
        myProduct2.showProductDetails();
    }
}

// IS-A Relation, Bike IS-A Product,Bike is child and Product is Parent
class Bike extends Product {
    int maxSpeed;
    String color;
    String fuelType;

    Bike() {
        System.out.println("Bike Object is constructed ");
    }

    //    we have redine the same method from the parent into the child with different inputs
//    We have 2 method in child, 1 from parent and 1 from child
//    both are different as in based on inputs but name is same
//    Method OverLoading: Same Method Name With different Inputs Parameters
    void setProductDetails(int pid, String name, int price, int maxSpeed, String color, String fuelType) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.fuelType = fuelType;
        System.out.println(">> Data Written in  Bike Object");
    }

    //         we have redine the same method from the parent into the child with different inputs
//      We have 2 method in child, 1 fro parent and 1 from child
//     Child Method will be executed and not the Parent
//    METHOD OVERRIDING: same method with same inputs in Parent Child RelationShip

    void showProductDetails() {
//        System.out.println("product id:" + pid);
        System.out.println("Name:" + name);
        System.out.println("price:" + price);
        System.out.println("maxSpeed:" + maxSpeed);
        System.out.println("color:" + color);
        System.out.println("fuelType:" + fuelType);
    }

}

public class inheritanceApp {

    //main method is excuted by JVM when my program will run
    public static void main(String[] args) {

//create an object : Product
        Product myProduct = new Product();
//myProduct is not an object its reference of variable which holds the hashcode of the object in hexadecimal notation

        Product product2 = new Product();

//     product2.id= 1;   Error now since attribute marked as private cannot accessed directly out of class
        product2.setPid(1);
        product2.name = "Nike";
        product2.price = 5000;
        product2.showProductDetails();


        System.out.println("myProduct is" + myProduct);
        myProduct.setProductDetails(101, "BOSH", 10000);
        myProduct.showProductDetails();


//        myProduct.setProductDetails(10111, "Apple");
        myProduct.showProductDetails();
        //    Requesting to get Bike Object Constructed
        Bike bike = new Bike();

        bike.setProductDetails(12, "MI", 10000);
        bike.showProductDetails();

        bike.setProductDetails(111, "CBR350", 200000, 350, "Green", "Petrol");
        bike.showProductDetails();
    }


}


