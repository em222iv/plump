package plump;

public class Player {
	
	private String name;
	public Player(String _name) {
		if(_name == null)
			throw new IllegalArgumentException();
		this.name = _name;
	}

	public String getName() {
		return this.name;
	}

	public void getHand() {
		throw new NullPointerException();
	}

	public void setHand() {
		// TODO Auto-generated method stub
		
	}

}
