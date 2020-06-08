import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {

    public static void main(String[] args) throws IOException {
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Integer Stream

        IntStream
                .range(1, 11)
//                .sum());
                .skip(0)
//                .forEach(System.out:: print);
                .forEach(str -> System.out.print(str));
        System.out.println();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Stream.of("Java", "Angular", "Node", "Zebra","AAAAAAAAAAA", "Anaconda")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] names = {"AI", "Python", "Ml", "Angular", "Node 3"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<String> people = Arrays.asList("Satyam", "Satyajeet", "Sonu", "ankit", "santosh", "rpesh", "Rohit");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("s"))
                .forEach(System.out::println);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Stream<String> brands = Files.lines(Paths.get("C:\\Users\\kumars10\\Desktop\\tools\\OOPS Program\\src\\test.txt"));
        brands
                .sorted()
                .filter(x -> x.length() > 5)
                .forEach(System.out::println);
        System.out.println();
        brands.close();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<String> myBrands = Files.lines(Paths.get("C:\\Users\\kumars10\\Desktop\\tools\\OOPS Program\\src\\test.txt"))
                .filter(x -> x.contains("jeet"))
                .collect(Collectors.toList());
        myBrands.forEach(x -> System.out.println(x));
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Stream<String> myFilterArray = Files.lines(Paths.get("C:\\Users\\kumars10\\Desktop\\tools\\OOPS Program\\src\\brand.txt"));
        int rowCount = (int)myFilterArray
                .map(x-> x.split(","))
                .filter(x->x.length > 3)
                .count();
        System.out.println(rowCount +  "rows");
        System.out.println();
        myFilterArray.close();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Reduction
        double total = Stream.of(3.5,4.5,5.5)
                .reduce(1.0, (Double a, Double b) -> a+b);
        System.out.println("Total = " + total);
    }


}
