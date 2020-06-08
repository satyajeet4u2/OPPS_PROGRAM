public class Box {

    double width;

    double height;

    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}
    class BoxDemo {
       public static void main (String args[]){
           Box mybox1 = new Box(10, 20,15);
           Box mybox2 = new Box(3, 6,9);

           double vol1;
           double vol2;
           vol1 = mybox1.volume();
           vol2 = mybox2.volume();
           System.out.println("volume is :" +vol1);
           System.out.println("volume is :" +vol2);

       }

}
