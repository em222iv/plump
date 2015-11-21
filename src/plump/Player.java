package plump;

public class Player {
	
	private String name;
	public Player(String object) {
		if(object == null)
			throw new IllegalArgumentException();
		this.name = object;
	}

	public String getName() {
		return this.name;
	}

}
