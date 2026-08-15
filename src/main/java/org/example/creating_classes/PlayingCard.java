package org.example.creating_classes;

import org.example.interfaces.Card;

import java.util.Objects;

public class PlayingCard implements Card {

    private final Rank rank;
    private final Suit suit;

    // constructor
    PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // implementations of Card abstract methods
    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    // implementation of Comparable<Card> method
    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }

    // toString, equals, hashCode

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PlayingCard that)) return false;
        return rank == that.rank && suit == that.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}