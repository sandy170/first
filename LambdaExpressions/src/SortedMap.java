import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortedMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(170, "sandeep");
		map.put(56, "Amazon");
		map.put(27, "Anil");
		map.put(35, "Hitler");
		
		System.out.println("sort by map value");
		map.entrySet().stream()
		         .sorted(Comparator.comparing(Map.Entry::getValue))
		         .forEach(e -> System.out.println("key:" + e.getKey() + ", Value: "+e.getValue()));
				
	}
}
