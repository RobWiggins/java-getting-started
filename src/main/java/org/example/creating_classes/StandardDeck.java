package org.example.creating_classes;

import org.example.interfaces.Card;
import org.example.interfaces.Deck;

import java.util.*;

public class StandardDeck implements Deck {

    private List<Card> entireDeck;

    // constructor, accessors

    @Override
    public List<Card> getCards() {
        return List.of();
    }

    @Override
    public Deck deckFactory() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addCard(Card card) {

    }

    @Override
    public void addCards(List<Card> cards) {

    }

    @Override
    public void addDeck(Deck deck) {

    }

    @Override
    public void shuffle() {

    }

    // you need to add all the methods from Deck
    public void sort() {
        Collections.sort(entireDeck);
    }

    @Override
    public void sort(Comparator<Card> c) {

    }

    @Override
    public String deckToString() {
        return "";
    }

    @Override
    public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
        return Map.of();
    }

    // toString, equals, hashCode
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StandardDeck that)) return false;
        return Objects.equals(entireDeck, that.entireDeck);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(entireDeck);
    }

    @Override
    public String toString() {
        return "StandardDeck{" +
                "entireDeck=" + entireDeck +
                '}';
    }
}
