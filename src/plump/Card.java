package plump;

public class Card {

	final Value value;
	final Suit suit;

    public Card (final Suit _suit,final Value _value) {
        this.value = _value;
        this.suit = _suit;
    }

	public int getA (){
		return this.a;
	}
}
