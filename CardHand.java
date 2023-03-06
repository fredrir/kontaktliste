package oving5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardHand implements CardContainer, Iterable<Card> {
    private List <Card> hand;

    public CardHand() {
        this.hand = new ArrayList<Card>();
    }

    public int getCardCount() {
        return hand.size();
    }

    //hei

    public Card getCard(int n) {
        if (n < 0 || n >= hand.size()) {
            throw new IllegalArgumentException(n + "er ikke gyldig");
        }
        return hand.get(n);
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card play(int n) {
        if (n < 0 || n >= hand.size()) {
            throw new IllegalArgumentException(n + "er ikke gyldig");
        }
        Card removeCard = hand.get(n);
        hand.remove(removeCard);
        return removeCard;
        
    }

    @Override
    public Iterator<Card> iterator() {
        return new CardContainerIterator(this);
}
}
