
 import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node");

    //method 1
        //Convert a Stream to List
        //List<String> result = language.collect(Collectors.toList());

       // result.forEach(System.out::println);
        
    //method 2
        //by using collectors.toCollection()
        List<String> result2  = language.collect(Collectors.toCollection(ArrayList::new));
        result2.forEach(System.out::println);
        
        // we can do in other ways too like
        //Using forEachOrdered method, Using toArray() method
    }
}