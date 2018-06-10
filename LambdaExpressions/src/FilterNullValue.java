
 import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValue{

    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

       // List<String> result1 = language.collect(Collectors.toList());

     //   result1.forEach(System.out::println);
        
        List<String> result2 = language.filter(x -> x!=null).collect(Collectors.toList());

        result2.forEach(System.out::println);
       

    }
}



