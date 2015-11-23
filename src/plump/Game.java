package plump;

public class Game {
	int rounds = 0;
	Player player;
	public Game(Player _player) {
		this.player = _player;
	}
	
	public Game(Player _player,int rounds) {
		this.player = _player;
		this.rounds = rounds;
	}
	
}
