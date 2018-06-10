
public class Player {
	
	public String firstName;
	public String lastName;
	public int num;
	
	public Player(String fs,String ls, int n) {
		
		firstName=fs;
		lastName=ls;
		num=n;
	}

	public String toString() {
		return lastName+" "+firstName;
	}
}
