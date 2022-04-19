public class Card {
	
	private int cardSuit;
	private int cardRank;

	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}

	/**
	 * Gets the rank of card.
	 */
	public String getRank() {
		switch (cardRank) {
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default : return Integer.toString(cardRank);
		}
	}

	/**
	 * Gets the suit of card.
	 */
	public String getSuit() {
		switch (cardSuit) {
			case 1: return "Spades";
			case 2: return "Hearts";
			case 3: return "Clubs";
			case 4: return "Diamonds";
			default: return "";
		}
	}

	/**
	 * Creates a String to identify this card.
	 */
	public String toString() {
		return cardRank + " of " + cardSuit;
	}
}