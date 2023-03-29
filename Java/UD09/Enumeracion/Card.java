package Enumeracion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Suit{SPADE, DIAMOND, CLUB, HEART}
enum Rank{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

class Card {
    private Suit suit;
    private Rank rank;
    
    Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    Rank getRank(){return rank;}
    Suit geSuit(){return suit;}
    public String toString(){return "This card is "+ rank + " of " + suit;}
}
class CardDeck{
    List<Card> deck;
    CardDeck(){
        deck = new ArrayList<Card>();
        for (Suit suit : Suit.values()){
            for(Rank rank: Rank.values()){
                deck.add(new Card(suit, rank));
            }
        }
    }
    public void print(){
        for(Card card : deck)
            System.out.println(card);
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
class CardTest{
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.print();
        System.out.println();
        deck.shuffle();
        deck.print();
    }
}
