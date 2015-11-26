package plump;

import java.util.ArrayList;

public class Turn {

	private ArrayList<Player> pList;

	public Turn(ArrayList<Player> _pList,Player first) {
		this.pList = _pList;
	}

	public ArrayList<Player> getPlayers() {
		return pList;
	}

	public void setFirst(Player firstPlayer) {
		// TODO Auto-generated method stub
		
	}

}

