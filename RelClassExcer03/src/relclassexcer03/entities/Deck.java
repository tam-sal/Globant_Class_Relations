/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassexcer03.entities;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author blue_
 */
public class Deck {

    private ArrayList<Card> _deck;

    public ArrayList<Card> createDeck() {
        for (int i = 0; i < 40; i++) {
            Card c = new Card();
            _deck.add(c);

        }
        return _deck;
    }

    public ArrayList<Card> shuffleDeck() {
        if (_deck.isEmpty()) {
            return null;
        } else {
            Collections.shuffle(_deck);
        }
        return _deck;
    }
    
    public void displayDeck(){
        System.out.println(_deck.toString());
    }

}
