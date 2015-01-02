package pokerHands;

public class card {

	char suit;
	int number;
	
	public card(char s, int n){
		suit = s;
		number = n;
	}

	public char getSuit() {
		return suit;
	}

	public void setSuit(char suit) {
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
