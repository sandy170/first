import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {
	
	public static void main(String[] args) {
		ArrayList<Player> players=new ArrayList<Player>();
		players.add(new Player("Sandeep","Reddy",14));
		players.add(new Player("Harsha","malipatlolla",26));
		players.add(new Player("Venkat","meruva",30));
		
		ArrayList<Player> players2=(ArrayList<Player>) players.clone();
		
		//old way
		Comparator<Player> c1=new Comparator<Player>() {
			public int compare(Player p1,Player p2) {
				
				return p1.lastName.compareTo(p2.lastName);
			}
			
		};
		
		Collections.sort(players, c1);
		System.out.println(players);
		
		// lambda way
		
		Comparator<Player> c2=(Player p1,Player p2) -> p1.lastName.compareToIgnoreCase(p2.lastName);
		Collections.sort(players, c2);
		System.out.println(players);
	}

}
