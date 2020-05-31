package exercicio_3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {
	public Deck() {
		cards = new ArrayList<Card>();
		// build the deck
		Suit[] suits = { Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
		// shuffle it!
		Collections.shuffle(cards, new Random());
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

	private List<Card> cards;
	private static Deck singletonInstance;

	synchronized static Deck getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Deck();

		return singletonInstance;
	}
}
