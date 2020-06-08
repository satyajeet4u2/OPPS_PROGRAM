import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class lambdas {

    public static void main(String[] args) {
        System.out.println(process("Without Lambda", new Processor() {
            public String process(String str) {
                return str.toUpperCase();
            }
        }));

        System.out.println(process("With Lambda", str -> str.toUpperCase()));

        System.out.println(process2("With process2 Lambda", str -> str.toUpperCase()));
        System.out.println(subStringMethod("BiFunctional lambda", 2, (str, i) -> str.substring(i)));
        System.out.println(subStringMethod("WEBiFunctional lambda", 2, String::substring));

        Product product4 = new Product();
product4.setProductDetails(1,"test",4000);
        product4.showProductDetails();
        System.out.println();

        final String title = "MR.";
//        Lambda Expression
        System.out.println(process("Satyajeet", str -> title.concat(str)));
//        Method Expression
        System.out.println(process("Kumar ", title::concat));


        //        Without lambda Expression
        String[] names = {"cMs aish", "aMr ramesh", "bMr bhgat"};

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
            }
        });
        System.out.println(Arrays.toString(names));
//        Witch lambda expression

        Arrays.sort(names, (name1, name2) -> name2.split(" ")[1].compareTo(name1.split(" ")[1]));
        System.out.println(Arrays.toString(names));
//        System.out.println(names);


        Arrays.sort(names, Comparator.comparing(name -> name.split(" ")[0]));
        System.out.println(Arrays.toString(names));
    }


    private static String process(String str, Processor processor) {
        return processor.process(str);
    }

    private static String process2(String str, Function<String, String> processor) {
        return processor.apply(str);
    }

    private static String subStringMethod(String str, int i, BiFunction<String, Integer, String> processor) {
        return processor.apply(str, i);
    }

}

    interface Processor {
        String process(String str);
    }
/*
what is functional interface ?
A functional interface is an interface that contains only one abstract method.
*/


   /*
Both expression is same
  1.   String::toUpperCase()
    str -> str.toUpperCase()


  2.  String::substring
    (str, i) -> str.substring(i)

  3. String::valueOf
    number -> String.valueOf(number)

   this is also a method reference
   This is referring tho the constructor of the String class

  4.  String::new
    (original) -> new String(original)

  5.  someString::concat
    (someOtherString) -> someString.concat(someOtherString)

    */
   /*
new Processor() {
public  String process*/


 /*
What is Abstract Class


   A method without body (no implementation) is known as abstract method. A method must always be declared in an abstract class, or in other words you can say that if a class has an abstract method, it should be declared abstract as well.

    public abstract int myMethod(int n1, int n2);



    */








